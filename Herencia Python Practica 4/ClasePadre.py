class DesigualdadPadre:

    __edad = int(0)
    __antiguedad = int(0)
    __Resultado = bool(0)

    def __init__(self,edad,antiguedad):
     self.__edad = edad
     self.__antiguedad = antiguedad
     self.__IMMS()

    def IMMS (self,edad,antiguedad):
      self.__edad = edad
      self.__antiguedad = antiguedad

    def get_IMMS(self):
        return self.__Resultado

    def get_ISSSTE(self):
        return self.__Resultado

    def IMMS(self):
        if self.__edad >= 60 & self.__antiguedad < 25:
            print("PERTENECE A LA PRIMERA JUBILACION")

        elif self.__edad <= 60 & self.__antiguedad >= 25:
            print("PERTENECE A LA SEGUNDA JUBILACION")

        else:
            self.__edad >= 60 & self.__antiguedad >= 25
            print("PERTENECE A LA TERCERA JUBILACION")

        return self.__Resultado

    def ISSSTE(self):
        if self.__edad <= 60 & self.__antiguedad > 25:
            print("PERTENECE A LA PRIMERA JUBILACION")

        elif self.__edad >= 60 & self.__antiguedad <= 25:
            print("PERTENECE A LA SEGUNDA JUBILACION")

        else:
            self.__edad <= 60 & self.__antiguedad <= 25
            print("PERTENECE A LA TERCERA JUBILACION")

        return self.__Resultado





