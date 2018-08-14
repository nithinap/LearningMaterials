#include<Creater.hpp>
class Creator
{
	public: void anOperation()
	{
		Product * product = factoryasMethod();
	}

	protected:  Product * factoryMethod()=0;
	
}
