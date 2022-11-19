/*
package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static void main(String[] args) {
        */
/*List<Map<String, String>> users = List.of(
                Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
                Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
                Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
                Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
                Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
                Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
                Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );

        List<String> men = Sorter.takeOldestMans(users);
        System.out.println(men);
*//*

        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] imageToSize = new String[image.length * 2][image.length * 2];

        */
/*System.out.println(image.length);
        System.out.println(imageToSize.length);
        IntStream.range(0, imageToSize.length)
                .forEach(i -> {
                    IntStream.range(0, imageToSize[i].length)
                            .forEach(j -> {
                                imageToSize[i][j] = image[i / 2][j / 2];
                            });
                });*//*

        Stream[] imageForStreamAPI = Arrays.stream(image)
                .flatMap()

        for (int i = 0; i < imageForStreamAPI.length; i++) {
            for (int j = 0; j < imageForStreamAPI[i].length; j++) {
                System.out.print(imageForStreamAPI[i][j] + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < imageToSize.length; i++) {
//            for (int j = 0; j < imageToSize[i].length; j++) {
//                System.out.print(imageToSize[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < image.length; i++) {
//            for (int j = 0; j < image[i].length; j++) {
//                System.out.print(image[i][j] + " ");
//            }
//            System.out.println();
        }
    }
    */
/*public static String [][] enlargeArrayImage(String [][] image){

    }*//*



// END
*/
