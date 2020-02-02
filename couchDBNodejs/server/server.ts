import Nano from 'nano'



let n = Nano('http://localhost:5984')
n.db.create('people').then((body) => {
  console.log('database people created!');
})
let db = n.db.use('people')

interface iPerson extends Nano.MaybeDocument {
  name: string,
  dob: string
}

class Person implements iPerson {
  _id: string
  _rev: string
  name: string
  dob: string

  constructor(name: string, dob: string) {
    this._id = undefined
    this._rev = undefined
    this.name = name
    this.dob = dob
  }

  processAPIResponse(response: Nano.DocumentInsertResponse) {
    if (response.ok === true) {
      this._id = response.id
      this._rev = response.rev
    }
  }
}

let p = new Person('Bob', '2015-02-04')
db.insert(p).then((response) => {
  p.processAPIResponse(response)
  console.log(p)
})