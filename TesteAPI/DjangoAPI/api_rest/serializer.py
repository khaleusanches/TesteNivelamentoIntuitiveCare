from rest_framework import serializers
from .models import OperadoraAtiva

class OperadoraAtivaSerializer(serializers.ModelSerializer):
    class Meta:
        model = OperadoraAtiva
        fields = '__all__'
