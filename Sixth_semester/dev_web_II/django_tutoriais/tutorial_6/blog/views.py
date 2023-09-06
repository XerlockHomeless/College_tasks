from django.shortcuts import render
from django.views.generic import DetailView, ListView
from django.views.generic.edit import CreateView
from .models import Post

# Create your views here.
class BlogListView(ListView):
    model = Post
    template_name = 'home.htm'

class BlogDetailView(DetailView):
    model = Post
    template_name = 'post_detail.htm'

class BlogCreateView(CreateView):
    model = Post
    template_name = 'post_new.htm'
    fields = ['title', 'author', 'body']    
