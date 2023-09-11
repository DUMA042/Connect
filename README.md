# Connect - Mars Data Viewer

Connect is a powerful Android application that allows users to explore fascinating data about the planet Mars. It leverages modern Android development technologies, including Retrofit, Hilt, Dagger 2, and Coil, to provide a seamless and informative experience.

![Connect App Screenshot](screenshots/connect_app_screenshot.png)

## Features

- **Mars Data Retrieval:** Connect uses Retrofit to fetch data from the [Mars API](https://mars.udacity.com/), providing users with the latest information about Mars, including images, weather, and geological data.

- **Dependency Injection with Hilt and Dagger 2:** The app is built using Hilt for dependency injection, making it easy to manage and inject dependencies throughout the application. Dagger 2 is also employed to set up the dependency graph.

- **Image Handling with Coil:** Coil, a third-party library, is used for efficient and responsive image loading and caching. This ensures that images are displayed smoothly and without unnecessary memory usage.

- **Asynchronous Image Download:** Images are downloaded asynchronously to provide a smooth user experience. Coil handles the image loading process in the background while the user interacts with the app.

## Installation

To build and run the Connect app locally, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/DUMA042/Connect-app.git
   
   
