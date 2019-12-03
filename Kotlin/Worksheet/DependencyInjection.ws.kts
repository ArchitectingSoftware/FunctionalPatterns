data class User(val userName: String, val password: String, val firstName: String, val lastName: String)

interface Repository{
    fun save(user: User) : Unit
}

class DatabaseRepository : Repository{
    override fun save(user: User){
        println("Saving User Name: ${user.userName} to disk")
    }
}

class MemoryRepository : Repository{
    override fun save(user: User){
        println("Saving User Name: ${user.userName} to memory")
    }
}

class UserService(val r: Repository) : Repository by r{
    fun create(user: User) {
        r.save(user)
    }
}

val userInDatabase = UserService(DatabaseRepository())
userInDatabase.create(User("brian", "foo", "brian", "mitchell"))

val userInMemory = UserService(MemoryRepository())
userInMemory.create(User("brian", "foo", "brian", "mitchell"))

//val bogusUser = UserService()
//bogusUser.create(User("brian", "foo", "brian", "mitchell"))
