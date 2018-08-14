#include<Creator.hpp>
class ConcreteCreator : public Creator
{
	protected: Product * factoryMethod()
	{
		return new ConcreteProduct();
	}
}
