from rest_framework import viewsets, filters
from .serializers import ClienteSerializer
from .models import Cliente
from django_filters.rest_framework import DjangoFilterBackend


# Create your views here.
class ClientesViewSet(viewsets.ModelViewSet):
    queryset = Cliente.objects.all()
    serializer_class = ClienteSerializer
    filter_backends = [DjangoFilterBackend, filters.OrderingFilter, filters.SearchFilter]
    ordering_fields = ['nome']
    search_fields = ['nome', 'cpf']
    filterset_fields = ['ativo']
