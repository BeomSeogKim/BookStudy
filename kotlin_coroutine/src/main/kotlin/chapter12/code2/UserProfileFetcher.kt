package chapter12.code2

class UserProfileFetcher(
    private val userNameRepository: UserNameRepository,
    private val userPhoneNumberRepository: UserPhoneNumberRepository
) {
    fun getUserProfileById(id: String): UserProfile {
        val userName = userNameRepository.getNameByUserId(id)
        val userPhoneNumber = userPhoneNumberRepository.getPhoneNumberByUserId(id)

        return UserProfile(
            id,
            userName,
            userPhoneNumber
        )
    }

}
