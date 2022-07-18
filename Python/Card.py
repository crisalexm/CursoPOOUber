from Payment import Payment

class Card(Payment):
    numberCard = int
    dataCard = str
    cvv = str

    def __init__(self, id, numberCard, dataCard, cvv):
        super().__init__(id)
        self.numberCard = numberCard
        self.dataCard = dataCard
        self.cvv = cvv
