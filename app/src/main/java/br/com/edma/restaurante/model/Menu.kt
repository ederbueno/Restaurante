package br.com.edma.restaurante.model

import java.io.Serializable

data class Menu (val name: String, val descripton: String, val imgMenu: Int) : Serializable{
}