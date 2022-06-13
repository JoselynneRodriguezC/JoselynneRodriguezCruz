from abc import ABCMeta

class DesigualdadesAbs(ABCMeta):

    # Método de clase
    @staticmethod
    def Desigualdad(edad,antiguedad):
        if edad > 60 and antiguedad < 25:
            return 1

        elif edad < 60 and antiguedad > 25:
            return 2
        else:
            edad > 60 and antiguedad > 25
            return 3

class pruebaArchivos:

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split(";"))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append([float(lineas[f][0]),  float(lineas[f][1])])
            except ValueError:
                lineas_archivo.append([0,0,0.0])
        return lineas_archivo

    def calcularDesigualdad(self, lista):
        resultados = []
        for f in range(0, len(lista)):
            resultados.append(DesigualdadesAbs.Desigualdad(
                lista[f][0],lista[f][1]))
        return resultados

    def guardarResultados(self, entrada, resultados):
        file = open("resultados.txt", 'w')
        for f in range(0, len(entrada)):
            linea = str(entrada[f][0]) + '#' + \
                    str(entrada[f][1]) + '#' + \
                    '#' + str(resultados[f]) +'\n'
            file.write(linea)
        file.close()

if __name__ == "__main__":
    prueba = pruebaArchivos()
    archivo = []
    archivo = prueba.leerArchivo("datos.txt")
    print(archivo)
    resultado = prueba.calcularDesigualdad(archivo)
    print(resultado)
    prueba.guardarResultados(archivo, resultado)