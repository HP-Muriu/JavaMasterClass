package dev.lpa;

public Contact queryContact(String name) {

    int position = findContact(name);
    if (position >= 0) {
        return this.myContacts.get(position);
    }
    return null;
}

public void printContacts() {

    System.out.println("Contact List:");
    for (int i = 0; i < this.myContacts.size(); i++) {
        System.out.println((i + 1) + ". " +
                this.myContacts.get(i).getName() + " -> " +
                this.myContacts.get(i).getPhoneNumber());
    }
}
}
