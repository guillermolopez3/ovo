package com.gru.ovo.helpers;

import com.gru.ovo.model.CarreraModel;
import com.gru.ovo.model.MenuModel;
import com.gru.ovo.model.NoticiaModel;

import java.util.ArrayList;

public class DatosCarreras
{
    public static ArrayList<MenuModel> menuCarreras()
    {
        ArrayList<MenuModel> array= new ArrayList<>();
        array.add(new MenuModel("Arquitectura, Urbanismo y Diseño", "arqui"));
        array.add(new MenuModel("Artes", "artes"));
        array.add(new MenuModel("Ciencias Agropecuarias", "agro"));
        array.add(new MenuModel("Ciencias Económicas", "eco"));
        return array;
    }



    public static ArrayList<NoticiaModel> noticias()
    {
        ArrayList<NoticiaModel> array = new ArrayList<>();
        array.add(new NoticiaModel(1,"Apertura de inscripciones para sus procesos gratuitos de orientación vocacional","Destinado a alumnos del último año del secundario"
        ,"- Destinatarios: \n Estudiantes cursando el último año del nivel secundario \n - Incripciones: \n 2 al 13 de abril " +
                "\n - Horarios: \n 10hs a 12 hs y de 14hs a 16 hs \n - Sede: \n Colegio Jerónimo Luis de cabrera",
                "https://www.facebook.com/ovo.cba"));
        array.add(new NoticiaModel(2,"Inscripciones para la escuela de oficios","Ya disponible para que te inscribas en la escuela de oficiosde la UNC",
                "El Programa de Formación en Oficios de Extensión de la Universidad Nacional de Córdoba (UNC) tiene en marcha las inscripciones para participar en los diferentes cursos gratuitos de la Escuela de Oficios 2018, que han tenido una convocatoria muy amplia durante las ediciones anteriores." +
                        "\n En su primer día, fue ampliamente visible el interés de la sociedad en participar de los quince cursos ofrecidos, en diferentes especialidades, estimando desde la Secretaría de Extensión de la UNC que el número de interesados podría alcanzar los ocho mil.",
                "http://www.cba24n.com.ar/content/desde-el-lunes-inscriben-para-la-escuela-de-oficios-de-la-unc"));
        return array;
    }

    public static ArrayList<NoticiaModel> becas()
    {
        ArrayList<NoticiaModel> array = new ArrayList<>();
        array.add(new NoticiaModel(1,"Programas de becas PROGRESAR","Se trata de Programa que acompaña al alumno durante su trayectoria académica, a través de un incentivo económico, que le permitirá poder avanzar en sus estudios hasta completarlos.",
                "La Secretaría de Asuntos Estudiantiles y Graduados de la Universidad Provincial de Córdoba informa que hasta el sábado 31 de marzo inclusive los interesados se podrán inscribir en el Programa de becas PROGRESAR impulsado por el Ministerio de Educación de la Nación." +
                        "\n Más información o consultas:\n" +
                        "\n" +
                        "Secretaría de Asuntos Estudiantiles y Graduados de la UPC\n" +
                        "\n" +
                        "Atelier 3 del campus Ciudad de las Artes (Av. Pablo Ricchieri 1955)\n" +
                        "\n" +
                        "Tel: 4430394\n" +
                        "\n" +
                        "Mail: asuntosestudiantiles@upc.edu.ar\n" +
                        "\n" +
                        "Facebook: https://www.facebook.com/AsuntosEstudiantilesyGraduados","http://www.upc.edu.ar/2018/03/14/programa-de-becas-progresar/"));
        return array;
    }
}
