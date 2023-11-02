from django.shortcuts import render
from rest_framework import viewsets
from .serializers import ClienteSerializer
from .models import Cliente


# Create your views here.
class ClientesViewSet(viewsets.ModelViewSet):
    """Listando clientes"""
    queryset = Cliente.objects.all()
    serializer_class = ClienteSerializer
