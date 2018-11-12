/**
 * 1. Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения,
 * как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать «Привет»,
 * нажать Enter, то сообщение должно передаться на сервер и там отпечататься в консоли.
 * Если сделать то же самое на серверной стороне, то сообщение передается клиенту и печатается у него в консоли.
 * Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд.
 * Такую ситуацию необходимо корректно обработать.
 * Разобраться с кодом с занятия: он является фундаментом проекта-чата
 * *ВАЖНО! * Сервер общается только с одним клиентом, т.е. не нужно запускать цикл,
 * который будет ожидать второго/третьего/n-го клиентов.
 */

package lesson_6_Work_with_network.consoleСhatTask.server;

import java.io.IOException;

/**
 * В этом классе мы просто создаем нового сервера
 */
public class ServerStart {
    public static void main(String[] args) {
        try {

            new ServerMain();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
