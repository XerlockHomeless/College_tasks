import django
from faker import Faker
import os
from random import choice, randrange
from validate_docbr import CPF

os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'config.settings')
django.setup()

from clientes.models import Cliente


def criando_pessoas(qtd_pessoas):
    fake = Faker('pt_BR')
    Faker.seed(10)
    for _ in range(qtd_pessoas):
        cpf = CPF()
        nome = fake.name()
        email = '{}@{}'.format(nome.lower(), fake.free_email_domain())
        email = email.replace(' ', '')
        cpf = cpf.generate()
        rg = "{}{}{}{}".format(
            randrange(10, 99),
            randrange(100, 999),
            randrange(100, 999),
            randrange(0, 9)
            )
        celular = "{} 9{}-{}".format(
            randrange(10, 21),
            randrange(4000, 9999),
            randrange(4000, 9999)
            )
        ativo = choice([True, False])
        p = Cliente(nome=nome, email=email, cpf=cpf,
                    rg=rg, celular=celular, ativo=ativo)
        p.save()


criando_pessoas(50)
print('Sucesso!')
