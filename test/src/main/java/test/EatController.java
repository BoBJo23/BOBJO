package test;

import java.util.Scanner;

public class EatController {
    public static void main(String[] args) {


            System.out.println("==================================================================================================");
            System.out.println("|   ⠀                                                                                             |");
            System.out.println("|   ⠀                                                                                             |");
            System.out.println("|                            ⠀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀           ㅇ  ㄴ   ㅁ          ㅈ ㅣ ?  　 　 |   ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⣀⠤⠖⠚⠉⠉⠀⠀  ⠀⠀⠉⠉⠙⠒⠤⣄⡀⣀⣠⣤⣀⡀⠀⠀⠀          ㅗ  ㅡ   ㅜ ㅓ  ㅁ ㅓ          　   |   ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⣠⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠈⠛⢯⡀⠀⠀  ⠀⠉⠳⣄⠀            ㄹ           ㄱ    　       　 |     ");
            System.out.println("| ⠀⠀ ⣀⠤⠔⠒⠒⠒⠦⢤⣀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣄⠀⠀⠀⠀⠀⣴⢶⣄⠀⠀   ⠀⠉⢢⡀⠀⠀⠀   ⠘⡆                                  　　  |        ");
            System.out.println("| ⢠⠞⠁⠀⠀⠀⠀⠀⠀  ⠀⠈⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⢹⣧⠀⠀⠀⠀⣿⠀⢹⣇⠀⠀⠀     ⠀⠙⢦⠀⠀  ⠀⣧                                천　　  |        ");
            System.out.println("| ⡏⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣦⣼⣿⡇⠀⠀⠀⢿⣿⣿⣿⡄⠀⠀⠀⠀      ⠈⢳⡀⢀⡟                            추　        |         ");
            System.out.println("| ⡇⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⡿⠿⠿⣿⠀⠀⠀⠘⣿⡛⣟⣧⠀⠀⠀⠀⠀       ⠀⢳⠞⠀                         뉴         다　 |         ");
            System.out.println("| ⢳⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⡄⢴⡿⠀⠀⠀⠀⠘⣿⣷⡏⠀⢀⡠⠤⣄⠀⠀      ⣇⠀                    메          쏜 　     |        ");
            System.out.println("| ⠀⢳⡀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⣠⠄⠀⠀⠀⠀⠀⠈⠛⠛⠁⣀⡤⠤⠤⠤⢌⣉⠀⠀⢠⡀⠀⠀⡱⠀      ⢸⡄               덤          가       　　  |        ");
            System.out.println("| ⠀⠀⠙⠦⣀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠸⣅⠀⠀⢀⡀⠀⠀⠀⢀⠴⠋⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠈⠉⠉⠀      ⠀⢘⣧           랜           니  　            |        ");
            System.out.println("| ⠀⠀⠀⠀⠈⠙⢲⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⣰⣋⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀    ⠀  ⠀⠀⢐⣿        1.          은         　         |      ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠉⠙⠒⢤⣀⠀⠀⠈⣇⠀    ⠀   ⠀⠀⠀⣿                늘                        |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⢸⠀    ⠀    ⠀⠀⢠⡏          오           뉴                 |    ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠘⣧         ⠀⠀⣸⠀      2.           메       　             |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⡟⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⢰⠏        ⠀⢠⠇⠀               체              　　         |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⢸⠁⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⣸⠀       ⢀⠏⠀           전                                |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⣿⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⣣⠃     ⠀⣠⠏⠀       3.                       　             |    ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠞⡱⠋   ⢀⡴⠁⠀⠀⠀                     　　 　         　         |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠈⠣⣄⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⢀⣀⡤⠖⢋⡠⠞⢁ ⡴⠋⡇⠀⠀⠀⠀⠀                               　      　　     |     ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠈⠙⠢⣄⡀⠀⠀⠀⠀⠈⠙⠯⠭⢉⠡⠤⠴⠒⣉⠴⠚⠁⠀⢰⠃⠀⠀⠀⠀                  　                            |      ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⠖⠲⠤⠤⠤⠤⠤⠤⢶⡖⠚⠉⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀  ⠀                   　                          |              ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠤⠤⠤⠤⠔⠋⠀⠀⠀⠀⠀⠀                        　　                       |            ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢤⡀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                            　                     |          ");
            System.out.println("| ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠑⠒⠒⠋⠂⠐⠒⠀⠀⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                             　                   |           ");
            System.out.println("==================================================================================================");
//            System.out.println("||                     ㅇ  ㄴ   ㅁ          　            　　 　  ||");
//            System.out.println("||                   ㅗ  ㅡ   ㅜ ㅓ   ㅁ ㅓ   ㅈ ㅣ ?　　         ||");
//            System.out.println("||  　         　　　　       ㄹ            ㄱ 　   　        　     ||");
//            System.out.println("||                                  　　                  ||");
//            System.out.println("||              　 　　    1. 랜덤(Random) 메뉴 추천　　　　          ||");
//            System.out.println("||                       2. 메뉴 보기                   　        ||");
//            System.out.println("||                     3. 우리집               　  　           ||");
//            System.out.println("||                     4. 니네집                　 　           ||");
//            System.out.println("||                     5. 랜덤집                  　 　         ||");
//            System.out.println("||    () ()                                  () ()  　　||");
//            System.out.println("||    ('.')                                  ('.') 　　 ||");
//            System.out.println("=========================================================");
            System.out.print("번호를 입력해 주세요 : ");

            }


        }
//    }

//}

