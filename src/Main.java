public class Main {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(999123456, "Xiaomi note10", 220);
        Phone secondPhone = new Phone(999654321, "Iphone XS", 245);
        Phone thirdPhone = new Phone(999987654, "Samsung S20", 310);

        firstPhone.receiveCall("Anna");
        System.out.println("Номер: " + firstPhone.getNumber());
        secondPhone.receiveCall("Ben");
        System.out.println("Номер: " + secondPhone.getNumber());
        thirdPhone.receiveCall("Beka");
        System.out.println("Номер: " + thirdPhone.getNumber());

        Phone phone = new Phone();
        phone.receiveCall("Alina", 123456789);

        phone.sendMassage(new long[]{firstPhone.getNumber(), secondPhone.number, thirdPhone.number});

        Phone[] allPhone = new Phone[]{firstPhone, secondPhone, thirdPhone};
        for (Phone res : allPhone) {
            System.out.println(res);
        }

    }
}
//Создайте класс Phone, который содержит переменные number,
// model и weight.Создайте три экземпляра этого класса.
// Выведите на консоль значения их переменных.
// Добавить в класс Phone методы: receiveCall,
// имеет один параметр – имя звонящего. Выводит на консоль сообщение
// “Звонит {name}”. Метод getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.Добавить конструктор в класс Phone,
// который принимает на вход три параметра для инициализации переменных класса -
// number, model и weight. Добавить конструктор, который принимает на
// вход два параметра для инициализации переменных класса - number, model.
// Добавить конструктор без параметров.Добавьте перегруженный метод receiveCall,
// который принимает два параметра - имя звонящего и номер телефона звонящего.
// Вызвать этот метод.Создать метод sendMessage с массивом номеров.
// Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
// Метод выводит на консоль номера этих телефонов.