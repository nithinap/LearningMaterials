## Git Branching & Release Strategy
### Main Branches
There will be two main branches with infinite lifetime:
`master` (origin/master) - with its HEAD always at a production-ready state
`develop` - with its HEAD reflecting the latest delivered development changes for the next release

![git merge no off] (https://github.com/nithinap/LearningMaterials/blob/master/git-merge-noOff.jpg)

### Support Branches
#### Feature: 
Used for development of new features for the upcoming or the distant releases. When starting development of a feature, the target release in which this feature will be incorporated may well be unknown at that point. 

The essence of a feature branch is that it exists as long as the feature is in development, but will eventually be merged back into develop (to definitely add the new feature to the upcoming release) or discarded (in case of a disappointing experiment).

   **Naming convention**: anything except master,develop, release-*, hotfix-*
```
    // branch off from develop
    $ git checkout -b featureName develop
    // Incorporate featureon develop branch
    // merge back to develop
    $ git merge --no-off featureName

    // The --no-ff flag causes the merge to always create a new commit object, even if the merge could be performed with a fast-forward. This avoids losing information about the historical existence of a feature branch and groups together all commits that together added the feature
    
    // delete feature branch
    $ git branch -d featureName
    $ git push origin develop
```

#### Release:
   **Naming convention**: release-<version_no>
The key moment to branch off a new release branch from develop is when develop (almost) reflects the desired state of the new release. At least all features that are targeted for the release-to-be-built must be merged in to develop at this point in time. All features targeted at future releases may not—they must wait until after the release branch is branched off.
It is exactly at the start of a release branch that the upcoming release gets assigned a version number—not any earlier. Up until that moment, the develop branch reflected changes for the “next release”, but it is unclear whether that “next release” will eventually become 0.3 or 1.0, until the release branch is started. That decision is made on the start of the release branch and is carried out by the project’s rules on version number bumping.

Creating release branch:
```
$ git checkout -b release-2.0 develop
$ ./bump-version.sh 2.0
$ git commit -a -m "Bumped version number to 2.0"
```
To finish a release branch: 
```
Merge release branch back to master
Tag the commit on master(for easy ref to the historical versions)
Merge back on release branch to develop branch - this ensures future releases to contain all bug fixes (fix merge conflicts if any)
```
Delete the release branch 
```
$ git checkout master
$ git merge --no-off release-1.0
$ git tag -a 1.0

$ git checkout develop
$ git merge --no-off release-1.0
$ git branch -d release-1.0
```

#### Hotfix:
   **Naming convention**: hotfix-*

Used to act immediately upon an undesired state of a live production branch. This would be similar to a release branch preparing a new production release, albeit unplanned.
 
This should branch off from the master, and must be merged back to master and develop. 

The essence is that work of team members (on the develop branch) can continue, while another person is preparing a quick production fix.
```
$ git checkout -b hotfix-1.0.1 master

// bump the version after braching off
$ ./bump-version.sh 1.0.1

$ git commit -a -m “Bumped version to 1.0.1”

// now add the bug fixes and commit 
$ git commit -m “Fixed severe production problem”


// to finish the hotfix, merge to master
$ git checkout master
$ git merge --no-ff hotfix-1.0.1
$ git tag -a 1.0.1 // new tag created

// merge hotfix to develop
$ git checkout develop
$ git merge --no-ff hotfix-1.0.1

Note: In case a release branch exists, merge back to release branch instead of develop

// finally, remove the hotfix branch
$ git branch -d hotfix-1.0.1
```

