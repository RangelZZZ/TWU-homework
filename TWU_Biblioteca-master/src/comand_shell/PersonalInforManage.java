package comand_shell;

import core.User;
import service.UserImpService;
import service.UserService;

import java.util.Scanner;

import static util.Constant.ALERT_SELECT_VALID_OPTION;

public class PersonalInforManage {

    private UserService userImpService = new UserImpService();

    public static void managePersonalInfor() {
        System.out.println(Menu.getPersonalPersonalInforMeun());
        String userInput = new Scanner(System.in).nextLine();
        handleUserInput(userInput);
    }

    private static void handleUserInput(String userInput) {
        if (userInput.equals("1")) {
            System.out.println(new PersonalInforManage().checkPersonalInformation());

        }else if(userInput.equals("2")){
            new App().handleUserInput();
        }else{
            System.out.println(ALERT_SELECT_VALID_OPTION);
        }
        managePersonalInfor();
    }

    private StringBuffer checkPersonalInformation() {
        StringBuffer userInformation = new StringBuffer();
        User user = userImpService.findUser("rangel");

        userInformation.append("name: ").append(user.getName()).append("\n")
                .append("address: ").append(user.getAddress()).append("\n")
                .append("email: ").append(user.getEmail()).append("\n")
                .append("phoneNumber: ").append(user.getPhoneNumber()).append("\n")
                .append("password: ").append(user.getPassword());
        return userInformation;
    }

}
