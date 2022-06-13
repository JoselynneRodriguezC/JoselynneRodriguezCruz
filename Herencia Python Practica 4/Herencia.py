from abc import ABC

class ClaseHerenciaDesigualdad (ABC):

    _edad = int(0)
    _antiguedad = int(0)

    def __init__(self,edad,antiguedad):
        self._edad = edad
        self._antiguedad = antiguedad


    @staticmethod
    def IMMS(self):
         pass

    def ISSSTE(self):
        pass


class ClaseIMMS(ClaseHerenciaDesigualdad):
    __Resultado = bool(0)

    def __init__(self,edad,antiguedad):
        ClaseHerenciaDesigualdad.__init__(self,edad,antiguedad)
        self.__edad = edad
        self.__antiguedad = antiguedad
        self.IMMS()

    def IMMS(self):
        if self.__edad >= 60 & self.__antiguedad < 25:
            print("PERTENECE A LA PRIMERA JUBILACION")

        elif self.__edad <= 60 & self.__antiguedad >= 25:
            print("PERTENECE A LA SEGUNDA JUBILACION")

        else:
            self.__edad >= 60 & self.__antiguedad >= 25
            print("PERTENECE A LA TERCERA JUBILACION")


    def getIMMS(self):
        return self.__Resultado



class ClaseISSSTE(ClaseHerenciaDesigualdad):
    __Resultado2 = bool(0)

    def __init__(self,edad,antiguedad):
        ClaseHerenciaDesigualdad.__init__(self,edad,antiguedad)
        self.__edad = edad
        self.__antiguedad = antiguedad
        self.ISSSTE()

    def ISSSTE(self):
        if self.__edad <= 60 & self.__antiguedad > 25:
            print("PERTENECE A LA PRIMERA JUBILACION")

        elif self.__edad >= 60 & self.__antiguedad <= 25:
            print("PERTENECE A LA SEGUNDA JUBILACION")

        else:
            self.__edad <= 60 & self.__antiguedad <= 25
            print("PERTENECE A LA TERCERA JUBILACION")


    def getISSSTE(self):
        return self.__Resultado2



