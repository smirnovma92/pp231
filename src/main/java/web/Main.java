package web;

import web.service.UserService;
import web.service.UserServiceImpl;

public class Main {
        public static void main(String[] args) {
            UserService userService = new UserServiceImpl();
            System.out.println(userService.getUsers());
        }

}
