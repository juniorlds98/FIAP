import pygame

#Iniciar o módulo
pygame.mixer.init()
pygame.init()

#Carregar música
pygame.mixer.music.load("music\Dan da Dan.mp3")

#Reproduzir música
pygame.mixer.music.play(loops=0, start=0.0)

#Espera a musica terminar
pygame.event.wait()