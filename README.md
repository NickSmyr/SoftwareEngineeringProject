# Quick Repair - Team 6

Στα πλαίσια της εργασίας θα αναπτύξετε μια εφαρμογή η οποία θα διευκολύνει την εύρεση του κατάλληλου τεχνικού για επισκευή διαφόρων βλαβών στο σπίτι. Οι χρήστες θα είναι είτε τεχνικοί είτε πελάτες. Οι τεχνικοί θα κάνουν εγγραφή και θα εντάσσονται σε μια από τις διαθέσιμες κατηγορίες - ειδικότητες. Θα δηλώνουν τις περιοχές τις οποίες εξυπηρετούν, τις εργασίες τις οποίες προσφέρουν, τις μέρες και ώρες τις οποίες είναι διαθέσιμοι, τρόπους επικοινωνίας καθώς και τις τιμές. 

Οι πελάτες θα μπορούν να μπαίνουν στην εφαρμογή χωρίς εγγραφή και να βλέπουν τα στοιχεία των εγγεγραμμένων τεχνικών. Κάνοντας εγγραφή θα μπορούν να κλείσουν ραντεβού με τεχνικό της επιλογής τους. Η αναζήτηση των τεχνικών θα γίνεται με βάση την ειδικότητα, την περιοχή, τη διαθεσιμότητα και την τιμή ανά προσφερόμενη εργασία. Η εφαρμογή θα προβάλλει μόνο τις διαθέσιμες ώρες για τα ραντεβού. Όταν ο πελάτης κλείσει κάποιο ραντεβού η εφαρμογή θα ενημερώνει τον τεχνικό με τον τρόπο που αυτός έχει επιλέξει (e-mail, τηλ, SMS) και αυτός θα μπαίνει στην εφαρμογή για να επιβεβαιώσει το ραντεβού. Με την επιβεβαίωση η εφαρμογή θα στέλνει e-mail στον πελάτη για την επιβεβαίωση του ραντεβού και θα δεσμεύει το συγκεκριμένο ραντεβού για τον συγκεκριμένο τεχνικό ώστε να μην είναι πλέον διαθέσιμο.
Με την ολοκλήρωση της εργασίας η εφαρμογή θα επιτρέπει την εξόφληση και αξιολόγηση του τεχνικού.

## Εισαγωγή
Στο παρόν έγγραφο αναλύονται λεπτομερώς οι προδιαγραφές των απαιτήσεων του λογισμικού Quick Repair. Στόχος αυτού του έργου είναι να δωσει την δυνατότητα στους τεχνικούς να προσφέρουν με ευκολία τις υπηρεσίες τους καθώς και να επιτρέψει στους χρήστες να αναζητήσουν τον κατάλληλο τεχνικό για την εργασία τους

### Εμβέλεια
Το Quick Repair είναι μια εφαρμογή Android που παρέχει ένα περιβάλλον χρήστη το οποίο δίνει την δυνατότοτητα αναζήτησης τεχνικού και διαμεσολάβεί για την επικοινωνία με αυτόν.

Αναλυτικότερα,οι τεχνικοί έχουν την δυνατότητα να εγγράφονται στην εφαρμογή συμπληρώνοντας τα στοιχεία που είναι απαραίτητα για την ταυτοποίηση του (Ονοματεπώνυμο, τηλέφωνο, ΑΦΜ, τραπεζικός λογαριασμός) καθώς και την ειδικότητα του, τις εργασίες που μπορεί να αναλάβει, τις περιοχές και τίς ώρες που μπορεί να εξυπηρετεί και τον επιθυμητό τρόπο ειδοποίησης του (SMS, email). Επιπλέον, επιτρέπει σε χρήστες να αναζητήσουν τεχνικούς που πληρούν τα κριτήρια αναζήτησης τους (τύπος εργασίας, περιοχή, κόστος εργασίας, διαθεσιμότητα). Για να προγραμματίσει ένα ραντεβού εγγράφεται ως πελάτης στο σύστημα εισάγωντας τα προσωπικά του στοιχεία(Ονοματεπώνυμο, τηλέφωνο, ΑΦΜ, τραπεζικός λογαριασμός).
 Για την δημιουργία ενός ραντεβού ο πελάτης θα πρέπει να επιλέξει την ημερομηνία που επιθυμεί, τον τρόπο πληρωμής, την διεύθυνση της τοποθεσίας συνάντησης και πιθανές λεπτομέρειες. Η εφαρμογή ειδοποεί τον τεχνικό, ο οποίος θα επιβεβαίωσει ή θα απορρίψει την πραγματοποίηση του ραντεβού. Ο πελάτης θα ενημερωθεί άμεσα μέσω της εφαρμογής για την επιλογή του. Με την επιβεβαίωση ολοκλήρωσης της εργασίας απο τον τεχνικό , θα πρέπει να επιλέγει εάν η πληρωμή έχει γίνει με μετρητά. Αν δεν το επιλέξει η εφαρμογή θα δεσμεύσει το ποσό από την κάρτα του πελάτη, στέλνοντας του μήνυμα για να καταθέσει μια αξιολόγηση(να βαθμολόγησει ή/και να σχολιάσει) για τις υπηρεσίες του. 
Πελάτες και τεχνικοί θα μπορούν να παρακολοθούν την εξέλιξη των ραντεβού τους, καθώς και να ακυρώσουν οποιοδήποτε απο αυτά επιθυμούν πριν την προκαθορισμένη ώρα συνάντησης. Τέλος, η εφαρμογή θα κρατάει τα έσοδα των τεχνικών έτσι ώστε να γνωρίζουν τα κέρδη τους.
## Συνολική περιγραφή

### Επισκόπηση μοντέλου περιπτώσεων χρήσης

![Use case diagram](requirements/diagrams/use_case.png)

### Πίνακα με τους κωδικούς, τους τίτλους και μία σύντομη περιγραφή των περιπτώσεων χρήσης

Κωδικός περίπτωσης χρήσης | Τίτλος | Σύντομη περιγραφή
------------ | ------------- | ------------- 
1 | Διαχείριση χρήστη | Ένας χρήστης καταγράφει στο σύστημα τα στοιχεία του. Αν ο χρήστης είναι τεχνικός επιλέγει ειδικότητα , εργάσιμες μέρες και ώρες , περιοχές , της εργασιες που προσφέρει , τρόπους επικοινωνίας και τιμές. Αν ο χρήστης είναι πελάτης καταγράφει τα προσωπικά του στοιχεία.
2 | Αναζήτηση | Ένας πελάτης εισάγει τα κριτήρια αναζήτησης (ειδικότητα, περιοχή, διαθεσιμότητα, τιμή ανα προσφερόμενη εργασία) και του εμφανίζει μια λίστα με τα διαθέσιμα ραντεβού.
3 | Δημιουργία ραντεβού | Αφού ένας πελάτης επιλέξει την διαθέσιμη ώρα για ραντεβού και τον επιθυμητό τρόπο πληρωμής (μετρητά, κάρτα) , πληροφορείται ο τεχνικός (SMS/e-mail) και το αποδέχεται. Αφού το αποδεχθεί ενημερώνεται ο πελάτης για το συγκεκριμένο ραντεβού με τον συγκεκριμένο τεχνικό ώστε να μην είναι πλέον διαθέσιμο.
4 | Ολοκλήρωση εργασίας | Αφου επιβεβαιώσει ο τεχνικός πως ολοκληρώθηκε η εργασία, ειδοποιείται ο πελάτης και αυτός καταβάλλει το απαιτούμενο ποσό και καταθέτει την αξιολόγηση του στο σύστημα για τον συγκεκριμένο τεχνικό.

