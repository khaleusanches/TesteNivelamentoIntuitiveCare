from django.contrib import admin
from django.urls import path, include
from . import views

urlpatterns = [
    path('<str:search>', views.get_operadora, name='get_operadora')
]