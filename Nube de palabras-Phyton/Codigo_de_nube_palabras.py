'''
                Proyecto: Nube de palabras
                        Integrantes
                    Del Valle Anthony
                    Mite Solano Lady
'''

'''Se importan las librerias necesarias'''
#from collections import Counter
from wordcloud import WordCloud
import csv

#stopwords = set(STOPWORDS)

'''Se declara el diccionario que tendra las palabras del texto y su frecuencia'''
diccionario={}


'''Se abre el documento con los Tags'''
#archivo=open('Tags.csv','r+')
with open('Tags.csv') as archivocsv:
    #archivo1 = csv.DictReader(archivocsv)
    archivo1 = csv.reader(archivocsv)

    '''Se recorre las columnas del archivo'''
    for col1,colTag,colCount,col4,col5 in archivo1:
        for i in range(int(colCount)):

            '''Se igualan las columnas de los tags con su frecuencia'''
            diccionario[colTag]=float(colCount)

'''Se genera la nube de palabras'''
#nubepalabra=Counter(diccionario)
nubepalabras = WordCloud(width = 1000, height = 1000,
                          background_color = 'white',
                          #stopwords = stopwords,
                          min_font_size = 10).generate_from_frequencies(diccionario)

'''Se guarda la nube de palabras como imagen'''
nubepalabras.to_file('Nube_de_palabras.png')

print('Su imagen ha sido generada exitosamente')
