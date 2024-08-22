package chapter12.code2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserProfileFetcherTest {

    @Test
    fun `UserNameRepository가 반환하는 이름이 홍길동이면 UserProfileFetcher에서 UserProfile을 가져왔을 때 이름이 홍길동이어야 한다`() {
        // given
        val userProfileFetcher = UserProfileFetcher(
            userNameRepository = StubUserNameRepository(
                userNameMap = mapOf<String, String>(
                    "0x1111" to "홍길동",
                    "0x2222" to "조세영"
                )
            ),
            userPhoneNumberRepository = FakeUserPhoneNumberRepository()
        )

        // when
        val userProfile = userProfileFetcher.getUserProfileById("0x1111")

        // then
        assertEquals("홍길동", userProfile.name)
    }

    @Test
    fun `UserPhoneNumberRepository에 휴대폰 번호가 저장돼 있으면, UserProfile을 가져왔을 때 해당 휴대폰 번호가 반환돼야 한다`() {
        // given
        val userProfileFetcher = UserProfileFetcher(
            userNameRepository = StubUserNameRepository(
                userNameMap = mapOf<String, String>(
                    "0x1111" to "홍길동",
                    "0x2222" to "조세영"
                )
            ),
            userPhoneNumberRepository = FakeUserPhoneNumberRepository().apply {
                this.saveUserPhoneNumber("0x1111", "010-xxxx-xxxx")
            }
        )

        // when
        val userProfile = userProfileFetcher.getUserProfileById("0x1111")

        // then
        assertEquals("010-xxxx-xxxx", userProfile.phoneNumber)
    }
}
