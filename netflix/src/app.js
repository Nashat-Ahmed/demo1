// src/app.js
const express = require('express');
const app = express();

// Middleware
app.use(express.json());

// Sample Route
app.get('/', (req, res) => {
    res.send('Welcome to Netflix-like App');
});

// Start Server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});

