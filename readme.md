# Testing of site: [Business Gett](https://business.gett.com/)

---

| № | Tests                                                            | Status |
|---|------------------------------------------------------------------|--------|
| 1 | Check login form                                                 | Pass   |
| 2 | Check the availability of email login field                      | Pass   |
| 3 | Check the login next button activation                           | Pass   |
| 4 | Email login field validation check with invalid email            | Pass   |
| 5 | Deactivation of email validation error after entering validEmail | Pass   |
| 6 | Check loading the forgot password page                           | Pass   |

---

### Used locators

| № | Element Name                | XPath                                     |
|---|-----------------------------|-------------------------------------------|
| 1 | Login form                  | //*[@data-component="LogInForm"]          |
| 2 | Email login field           | //*[@data-name="emailLoginForm"]          |
| 3 | Login next button           | //*[@data-name="loginNextButton"]         |
| 4 | Email validation error      | //*[@data-name="emailValidationError"]    |
| 5 | Sign-in button              | //*[@data-name="loginButton"]             |
| 6 | Forgot password link        | //*[@data-name="forgotPasswordLink"]      |
| 7 | Forgot password form        | //*[@data-component="ForgotPassword"]     |
| 8 | Email validation error      | //*[@data-name="emailValidationError"]    |