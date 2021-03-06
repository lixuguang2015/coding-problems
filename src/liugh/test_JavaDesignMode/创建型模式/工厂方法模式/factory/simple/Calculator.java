package liugh.test_JavaDesignMode.创建型模式.工厂方法模式.factory.simple;

/**
 * 使用工厂方法生成实例完成运算操作
 * 
 * @author liu yuning
 *
 */
public class Calculator {
    public static void main(String[] args) {
	Operation operation;
	char operator;

	operator = '+';
	operation = OperationFactory.createOperation(operator);
	operation.numberA = 1.2;
	operation.numberB = 2.3;

	System.out.println(operation.result());
    }
}