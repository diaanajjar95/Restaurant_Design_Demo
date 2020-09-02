package com.example.restaurantdesigndemo

class DataSource {

    companion object {

        fun getItems(): ArrayList<ListItem> {
            val items = ArrayList<ListItem>()

            items.add(
                ListItem(
                    title = "Main Dish",
                    itemCount = 40,
                    image = "https://images.pexels.com/photos/1624487/pexels-photo-1624487.jpeg?cs=srgb&dl=pexels-rajesh-tp-1624487.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Pizza",
                    itemCount = 30,
                    image = "https://images.pexels.com/photos/1260968/pexels-photo-1260968.jpeg?cs=srgb&dl=pexels-daria-shevtsova-1260968.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Salads",
                    itemCount = 25,
                    image = "https://images.pexels.com/photos/257816/pexels-photo-257816.jpeg?cs=srgb&dl=pexels-jill-wellington-257816.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Desserts",
                    itemCount = 20,
                    image = "https://images.pexels.com/photos/3992134/pexels-photo-3992134.jpeg?cs=srgb&dl=pexels-cottonbro-3992134.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Pasta",
                    itemCount = 20,
                    image = "https://images.pexels.com/photos/1487511/pexels-photo-1487511.jpeg?cs=srgb&dl=pexels-engin-akyurt-1487511.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Beverages",
                    itemCount = 20,
                    image = "https://images.pexels.com/photos/7412/pexels-photo.jpg?cs=srgb&dl=pexels-j%C3%A9shoots-7412.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Burgers",
                    itemCount = 15,
                    image = "https://images.pexels.com/photos/1633578/pexels-photo-1633578.jpeg?cs=srgb&dl=pexels-rajesh-tp-1633578.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Fries",
                    itemCount = 5,
                    image = "https://images.pexels.com/photos/115740/pexels-photo-115740.jpeg?cs=srgb&dl=pexels-marco-fischer-115740.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Salads",
                    itemCount = 5,
                    image = "https://images.pexels.com/photos/1211887/pexels-photo-1211887.jpeg?cs=srgb&dl=pexels-iina-luoto-1211887.jpg&fm=jpg"
                )
            )
            items.add(
                ListItem(
                    title = "Healthy Food",
                    itemCount = 10,
                    image = "https://images.pexels.com/photos/1640771/pexels-photo-1640771.jpeg?cs=srgb&dl=pexels-ella-olsson-1640771.jpg&fm=jpg"
                )
            )

            return items
        }

    }

}