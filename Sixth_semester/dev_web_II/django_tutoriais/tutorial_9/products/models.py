from django.db import models
from django.urls import reverse

# Create your models here.
class Product(models.Model):
    name = models.CharField('Name', max_length=100)
    description = models.TextField('Description', blank=True)    
    price = models.DecimalField('Price', decimal_places=2, max_digits=8)
    created = models.DateTimeField('Created', auto_now_add=True)
    changed = models.DateTimeField('Changed', auto_created=True)

    class Meta:
        ordering = ['name']

    def __str__(self) -> str:
        return self.name

    def get_absolute_url(self):
        return reverse("product_edit", kwargs={"pk": self.pk})
