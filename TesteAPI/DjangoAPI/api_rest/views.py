from django.shortcuts import render
from django.http import HttpResponse, JsonResponse

from rest_framework.decorators import api_view
from rest_framework.response import Response
from rest_framework import status

from .models import OperadoraAtiva
from .serializer import OperadoraAtivaSerializer

import csv

@api_view(['GET'])
def get_operadora(request, search):
    if request.method == 'GET':
        relatorio = open('C:\\Users\\khaleu\\Desktop\\Projetos\\TesteNivelamentoIntuitiveCare\\TesteAPI\\Relatorio_cadop.csv', 'r', encoding="utf-8")
        reader = csv.reader(relatorio)
        response = []
        for linha in reader:
            linha_certa = "".join(linha).replace('\"', '')
            cell = linha_certa.split(";")
            for cel in cell:
                if (search in cel):
                    op = OperadoraAtiva(cell)
                    response.append(op)
        if response.count == 0:
            return Response(status=status.HTTP_404_NOT_FOUND)
        serializer = OperadoraAtivaSerializer(response, many=True)
        return Response(serializer.data)
    return Response(status=status.HTTP_400_BAD_REQUEST)