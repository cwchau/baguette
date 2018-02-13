# baguette
By Connie Chau, Gauri Laxman, Melodee Li, and Aria Paradkar

This project was created at Tartanhacks 2018 at Carnegie Mellon University, and won Rockwell Automation's Best Hack for Improving the Environment.

Baguette offers grocery store discounts to encourage customers to use reusable shopping bags. Once a user creates an account, the app generates a unique QR code to that user. Whenever the customer makes a purchase, the cashier scans the QR with their phone, and then enters the total weight of the customer's purchased items. This weight is used to calculate an approximate amount of plastic bags that would have been wasted had the customer not used reusable bags. The datum then gets sent back to the customer's account, which will indicate the customer's current progress in "percent baguette." Each time the customer successfully fills a baguette, they receive a $10 discount for any partnering store.

This app was primarily written in Java in Android Studio. We used the ZXing library to generate barcodes, and the Mobile Vision API to develop a barcode scanner. We also used a server, written in Python, to implement login authentication.
