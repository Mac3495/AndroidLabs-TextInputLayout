package com.herprogramacion.cursospoint;

import java.util.Arrays;
import java.util.List;

/**
 * Creado por Hermosa Programación.
 */
public class Courses {
    private static Course[] courses = {
            new Course("Toolbar en Android",
                    "Aprende todo los referido al Toolbar en una aplicación" +
                            "Todos los usos que se pueden dar al Toolbar y las nuevas opciones que trae\n" +
                            "\n" +
                            "Marcelo Torrez \n" +
                            "120 minutos de aprendizaje", "Android Lab 05",
                    3f, 4340, R.drawable.img1),
            new Course("Tab Layouts en Android",
                    "Quieres que tu aplicación tenga ventanas como Facebook y Whatsapp?" +
                            " el uso de la Tablas o Tab layouts es lo indicado para ti!.\n" +
                            "\n" +
                            "Remmy Calamani\n" +
                            "\n" +
                            "120 minutos de aprendizaje\n", "Android Lab 06",
                    5f, 220, R.drawable.img2),
            new Course("Navigation Drawer en Android",
                    "En este Lab se vio que es el NavigationDrawer, su implementación y uso en un app" +
                            "junto con el manejo de fragmentos.\n" +
                            "\n" +
                            "Marcelo Torrez\n" +
                            "\n" +
                            "120 minutos de aprendizaje", "Android Lab 07",
                    4.4f, 34235, R.drawable.img3),
            new Course("RecyclerViews y CardViews en Android",
                    "Con estos componentes puedes desarrollar cualquier aplicación y que se vea excelente! " +
                            "Los RecyclerViews y CardViews son una conbinacion poderosa " +
                            "con la que podras tener una UI muy bonita.\n" +
                            "\n" +
                            "Remmy Calamani\n" +
                            "\n" +
                            "120 minutos de aprendizaje\n", "Android Lab 08",
                    3.4f, 11245, R.drawable.img4),
            new Course("Textos flotantes y Transiciones",
                    "Aprende a crear entradas de extos con estilos Materail Design " +
                            "y las animaciones entre actividades.\n" +
                            "\n" +
                            "Marcelo Torrez\n" +
                            "\n" +
                            "120 minutos de aprendizaje", "Android Lab 09",
                    4.0f, 122, R.drawable.img5),
            new Course("Floating Action Buton",
                    "Quieres saber todo lo relacionado a los FABs? en este Lab veras todo lo que se  " +
                            "puede rrealizar con la ayuda de estos bonitos botones! " +
                            "note pierdas del ultimo Lab del curso!.\n" +
                            "\nNuevos cursos estan por llegar! y estas invitado!\n" +
                            "Remmy Calamani.\n" +
                            "120 minutos de aprendizaje",
                    "Android Lab 10", 3.2f, 2503, R.drawable.img6),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<Course> getCourses() {
        return Arrays.asList(courses);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static Course getCourseByPosition(int position) {
        return courses[position];
    }

}
