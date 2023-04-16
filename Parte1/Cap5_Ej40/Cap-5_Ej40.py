from math import sqrt
import tkinter as tk
import tkinter.messagebox as msg

class Calculos:
    def __init__(self):
        self.datos = []
    
    def Raiz(self):
        Raiz = []
        for i in range(len(self.datos)):
            Raiz.append(sqrt(self.datos[i]))
        return Raiz
    
    def Cuadrado(self):
        Cuadrado = []
        for i in range(len(self.datos)):
            Cuadrado.append((self.datos[i]**2))
        return Cuadrado
    
    def Cubo(self):
        Cubo = []
        for i in range(len(self.datos)):
            Cubo.append(((self.datos[i])**3))
        return Cubo
    
    def Añadir(self,a):
        self.datos.append(a)
    
    def Borrar(self):
        self.datos.clear()
    
    def getInt(self,txt):
        a = int(txt.get())
        txt.delete(0,tk.END)
        return a
    
    def Final(self):
        Raiz = self.Raiz()
        Cuadrado = self.Cuadrado()
        Cubo = self.Cubo()
        a = ""
        for i in range(len(self.datos)):
            a += "La raíz de " + str(self.datos[i]) + " es " + str(round(Raiz[i],4)) + " su cuadrado es " + str(round(Cuadrado[i],4)) + ", y su cubo es " + str(round(Cubo[i],4)) + "\n\n"
        msg.showinfo("Resultados", a)

#Instanciar la clase
Datos = Calculos()

#Crear la Ventana Principal
VentanaPrincipal = tk.Tk()
VentanaPrincipal.geometry("480x75")
VentanaPrincipal.title("Calculos")

#Comentario de indicaciones
lblP = tk.Label(VentanaPrincipal, text = "Por favor ingrese los datos uno por uno pulsando añadir, al finalizar pulse calcular \nAl pulsar borrar, los datos que hayan sido añadidos se borran")
lblP.grid(row = 0, column = 0, columnspan = 6,padx = 30)

#Cuadro de entrada txt
txtAñadir = tk.Entry(VentanaPrincipal)
txtAñadir.grid(row = 2, column = 0, padx = 5, pady = 5)

#Botones
btnAñadir = tk.Button(VentanaPrincipal, text = "Añadir", command = lambda: Datos.Añadir(Datos.getInt(txtAñadir)))
btnAñadir.grid(row = 2, column = 1, padx = 0, pady = 5)

btnBorrar = tk.Button(VentanaPrincipal, text = "Borrar", command = lambda: Datos.Borrar())
btnBorrar.grid(row = 2, column = 2, pady = 5)

btnCalcular = tk.Button(VentanaPrincipal, text = "Calcular", command = lambda: Datos.Final())
btnCalcular.grid(row = 2, column = 3, pady = 5)

btnCerrar = tk.Button(VentanaPrincipal, text = "Cerrar", command = VentanaPrincipal.destroy)
btnCerrar.grid(row = 2, column = 4, pady = 5)

#Mantener la ventana activa
VentanaPrincipal.mainloop()