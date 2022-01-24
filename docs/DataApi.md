# DataApi

All URIs are relative to *https://api.clever.com/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContactsForUser**](DataApi.md#getContactsForUser) | **GET** /users/{id}/mycontacts | 
[**getCourse**](DataApi.md#getCourse) | **GET** /courses/{id} | 
[**getCourseForSection**](DataApi.md#getCourseForSection) | **GET** /sections/{id}/course | 
[**getCourses**](DataApi.md#getCourses) | **GET** /courses | 
[**getCoursesForResource**](DataApi.md#getCoursesForResource) | **GET** /resources/{id}/courses | 
[**getCoursesForSchool**](DataApi.md#getCoursesForSchool) | **GET** /schools/{id}/courses | 
[**getDistrict**](DataApi.md#getDistrict) | **GET** /districts/{id} | 
[**getDistrictForCourse**](DataApi.md#getDistrictForCourse) | **GET** /courses/{id}/district | 
[**getDistrictForSchool**](DataApi.md#getDistrictForSchool) | **GET** /schools/{id}/district | 
[**getDistrictForSection**](DataApi.md#getDistrictForSection) | **GET** /sections/{id}/district | 
[**getDistrictForTerm**](DataApi.md#getDistrictForTerm) | **GET** /terms/{id}/district | 
[**getDistrictForUser**](DataApi.md#getDistrictForUser) | **GET** /users/{id}/district | 
[**getDistricts**](DataApi.md#getDistricts) | **GET** /districts | 
[**getResource**](DataApi.md#getResource) | **GET** /resources/{id} | 
[**getResources**](DataApi.md#getResources) | **GET** /resources | 
[**getResourcesForCourse**](DataApi.md#getResourcesForCourse) | **GET** /courses/{id}/resources | 
[**getResourcesForSection**](DataApi.md#getResourcesForSection) | **GET** /sections/{id}/resources | 
[**getResourcesForUser**](DataApi.md#getResourcesForUser) | **GET** /users/{id}/resources | 
[**getSchool**](DataApi.md#getSchool) | **GET** /schools/{id} | 
[**getSchoolForSection**](DataApi.md#getSchoolForSection) | **GET** /sections/{id}/school | 
[**getSchools**](DataApi.md#getSchools) | **GET** /schools | 
[**getSchoolsForCourse**](DataApi.md#getSchoolsForCourse) | **GET** /courses/{id}/schools | 
[**getSchoolsForTerm**](DataApi.md#getSchoolsForTerm) | **GET** /terms/{id}/schools | 
[**getSchoolsForUser**](DataApi.md#getSchoolsForUser) | **GET** /users/{id}/schools | 
[**getSection**](DataApi.md#getSection) | **GET** /sections/{id} | 
[**getSections**](DataApi.md#getSections) | **GET** /sections | 
[**getSectionsForCourse**](DataApi.md#getSectionsForCourse) | **GET** /courses/{id}/sections | 
[**getSectionsForResource**](DataApi.md#getSectionsForResource) | **GET** /resources/{id}/sections | 
[**getSectionsForSchool**](DataApi.md#getSectionsForSchool) | **GET** /schools/{id}/sections | 
[**getSectionsForTerm**](DataApi.md#getSectionsForTerm) | **GET** /terms/{id}/sections | 
[**getSectionsForUser**](DataApi.md#getSectionsForUser) | **GET** /users/{id}/sections | 
[**getStudentsForUser**](DataApi.md#getStudentsForUser) | **GET** /users/{id}/mystudents | 
[**getTeachersForUser**](DataApi.md#getTeachersForUser) | **GET** /users/{id}/myteachers | 
[**getTerm**](DataApi.md#getTerm) | **GET** /terms/{id} | 
[**getTermForSection**](DataApi.md#getTermForSection) | **GET** /sections/{id}/term | 
[**getTerms**](DataApi.md#getTerms) | **GET** /terms | 
[**getTermsForSchool**](DataApi.md#getTermsForSchool) | **GET** /schools/{id}/terms | 
[**getUser**](DataApi.md#getUser) | **GET** /users/{id} | 
[**getUsers**](DataApi.md#getUsers) | **GET** /users | 
[**getUsersForResource**](DataApi.md#getUsersForResource) | **GET** /resources/{id}/users | 
[**getUsersForSchool**](DataApi.md#getUsersForSchool) | **GET** /schools/{id}/users | 
[**getUsersForSection**](DataApi.md#getUsersForSection) | **GET** /sections/{id}/users | 


<a name="getContactsForUser"></a>
# **getContactsForUser**
> UsersResponse getContactsForUser(id, limit, startingAfter, endingBefore)



Returns the contact users for a student user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getContactsForUser(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getContactsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCourse"></a>
# **getCourse**
> CourseResponse getCourse(id)



Returns a specific course

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    CourseResponse result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CourseResponse**](CourseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCourseForSection"></a>
# **getCourseForSection**
> CourseResponse getCourseForSection(id)



Returns the course for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    CourseResponse result = apiInstance.getCourseForSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getCourseForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CourseResponse**](CourseResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCourses"></a>
# **getCourses**
> CoursesResponse getCourses(limit, startingAfter, endingBefore, count)



Returns a list of courses

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    CoursesResponse result = apiInstance.getCourses(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCoursesForResource"></a>
# **getCoursesForResource**
> CoursesResponse getCoursesForResource(id, limit, startingAfter, endingBefore)



Returns the courses for a resource

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    CoursesResponse result = apiInstance.getCoursesForResource(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getCoursesForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCoursesForSchool"></a>
# **getCoursesForSchool**
> CoursesResponse getCoursesForSchool(id, limit, startingAfter, endingBefore)



Returns the courses for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    CoursesResponse result = apiInstance.getCoursesForSchool(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getCoursesForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrict"></a>
# **getDistrict**
> DistrictResponse getDistrict(id)



Returns a specific district

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrict(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrict");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForCourse"></a>
# **getDistrictForCourse**
> DistrictResponse getDistrictForCourse(id)



Returns the district for a course

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrictForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForSchool"></a>
# **getDistrictForSchool**
> DistrictResponse getDistrictForSchool(id)



Returns the district for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForSchool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrictForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForSection"></a>
# **getDistrictForSection**
> DistrictResponse getDistrictForSection(id)



Returns the district for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrictForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForTerm"></a>
# **getDistrictForTerm**
> DistrictResponse getDistrictForTerm(id)



Returns the district for a term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrictForTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistrictForUser"></a>
# **getDistrictForUser**
> DistrictResponse getDistrictForUser(id)



Returns the district for a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    DistrictResponse result = apiInstance.getDistrictForUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistrictForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**DistrictResponse**](DistrictResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDistricts"></a>
# **getDistricts**
> DistrictsResponse getDistricts(count)



Returns a list of districts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String count = "count_example"; // String | 
try {
    DistrictsResponse result = apiInstance.getDistricts(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getDistricts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**DistrictsResponse**](DistrictsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResource"></a>
# **getResource**
> ResourceResponse getResource(id)



Returns a specific resource

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    ResourceResponse result = apiInstance.getResource(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ResourceResponse**](ResourceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResources"></a>
# **getResources**
> ResourcesResponse getResources(limit, startingAfter, endingBefore)



Returns a list of resources

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    ResourcesResponse result = apiInstance.getResources(limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**ResourcesResponse**](ResourcesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourcesForCourse"></a>
# **getResourcesForCourse**
> ResourcesResponse getResourcesForCourse(id, limit, startingAfter, endingBefore)



Returns the resources for a course

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    ResourcesResponse result = apiInstance.getResourcesForCourse(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getResourcesForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**ResourcesResponse**](ResourcesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourcesForSection"></a>
# **getResourcesForSection**
> ResourcesResponse getResourcesForSection(id, limit, startingAfter, endingBefore)



Returns the resources for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    ResourcesResponse result = apiInstance.getResourcesForSection(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getResourcesForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**ResourcesResponse**](ResourcesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResourcesForUser"></a>
# **getResourcesForUser**
> ResourcesResponse getResourcesForUser(id, limit, startingAfter, endingBefore)



Returns the resources for a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    ResourcesResponse result = apiInstance.getResourcesForUser(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getResourcesForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**ResourcesResponse**](ResourcesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchool"></a>
# **getSchool**
> SchoolResponse getSchool(id)



Returns a specific school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    SchoolResponse result = apiInstance.getSchool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SchoolResponse**](SchoolResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolForSection"></a>
# **getSchoolForSection**
> SchoolResponse getSchoolForSection(id)



Returns the school for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    SchoolResponse result = apiInstance.getSchoolForSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchoolForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SchoolResponse**](SchoolResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchools"></a>
# **getSchools**
> SchoolsResponse getSchools(limit, startingAfter, endingBefore, count)



Returns a list of schools

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchools(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolsForCourse"></a>
# **getSchoolsForCourse**
> SchoolsResponse getSchoolsForCourse(id, limit, startingAfter, endingBefore)



Returns the schools for a course

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForCourse(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchoolsForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolsForTerm"></a>
# **getSchoolsForTerm**
> SchoolsResponse getSchoolsForTerm(id, limit, startingAfter, endingBefore)



Returns the schools for a term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForTerm(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchoolsForTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchoolsForUser"></a>
# **getSchoolsForUser**
> SchoolsResponse getSchoolsForUser(id, primary, limit, startingAfter, endingBefore)



Returns the schools for a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
String primary = "primary_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SchoolsResponse result = apiInstance.getSchoolsForUser(id, primary, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSchoolsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **primary** | **String**|  | [optional] [enum: , true]
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SchoolsResponse**](SchoolsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSection"></a>
# **getSection**
> SectionResponse getSection(id)



Returns a specific section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    SectionResponse result = apiInstance.getSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SectionResponse**](SectionResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSections"></a>
# **getSections**
> SectionsResponse getSections(limit, startingAfter, endingBefore, count)



Returns a list of sections

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSections(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsForCourse"></a>
# **getSectionsForCourse**
> SectionsResponse getSectionsForCourse(id, limit, startingAfter, endingBefore)



Returns the sections for a course

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForCourse(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSectionsForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsForResource"></a>
# **getSectionsForResource**
> SectionsResponse getSectionsForResource(id, limit, startingAfter, endingBefore)



Returns the sections for a resource

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForResource(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSectionsForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsForSchool"></a>
# **getSectionsForSchool**
> SectionsResponse getSectionsForSchool(id, limit, startingAfter, endingBefore)



Returns the sections for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForSchool(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSectionsForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsForTerm"></a>
# **getSectionsForTerm**
> SectionsResponse getSectionsForTerm(id, limit, startingAfter, endingBefore)



Returns the sections for a term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForTerm(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSectionsForTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectionsForUser"></a>
# **getSectionsForUser**
> SectionsResponse getSectionsForUser(id, limit, startingAfter, endingBefore)



Returns the sections for a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    SectionsResponse result = apiInstance.getSectionsForUser(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getSectionsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStudentsForUser"></a>
# **getStudentsForUser**
> UsersResponse getStudentsForUser(id, limit, startingAfter, endingBefore)



Returns the student users for a teacher or contact user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getStudentsForUser(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getStudentsForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeachersForUser"></a>
# **getTeachersForUser**
> UsersResponse getTeachersForUser(id, limit, startingAfter, endingBefore)



Returns the teacher users for a student user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getTeachersForUser(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getTeachersForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTerm"></a>
# **getTerm**
> TermResponse getTerm(id)



Returns a specific term

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    TermResponse result = apiInstance.getTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TermResponse**](TermResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTermForSection"></a>
# **getTermForSection**
> TermResponse getTermForSection(id)



Returns the term for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    TermResponse result = apiInstance.getTermForSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getTermForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TermResponse**](TermResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTerms"></a>
# **getTerms**
> TermsResponse getTerms(limit, startingAfter, endingBefore, count)



Returns a list of terms

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    TermsResponse result = apiInstance.getTerms(limit, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional] [enum: , true]

### Return type

[**TermsResponse**](TermsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTermsForSchool"></a>
# **getTermsForSchool**
> TermsResponse getTermsForSchool(id, limit, startingAfter, endingBefore)



Returns the terms for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    TermsResponse result = apiInstance.getTermsForSchool(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getTermsForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**TermsResponse**](TermsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(id)



Returns a specific user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
try {
    UserResponse result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UsersResponse getUsers(limit, role, startingAfter, endingBefore, count)



Returns a list of contact, district admin, staff, student, and/or teacher users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
Integer limit = 56; // Integer | 
String role = "role_example"; // String | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
String count = "count_example"; // String | 
try {
    UsersResponse result = apiInstance.getUsers(limit, role, startingAfter, endingBefore, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **role** | **String**|  | [optional] [enum: contact, district_admin, staff, student, teacher]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]
 **count** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersForResource"></a>
# **getUsersForResource**
> UsersResponse getUsersForResource(id, role, limit, startingAfter, endingBefore)



Returns the student and/or teacher users for a resource

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
String role = "role_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getUsersForResource(id, role, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getUsersForResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **role** | **String**|  | [optional] [enum: student, teacher]
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersForSchool"></a>
# **getUsersForSchool**
> UsersResponse getUsersForSchool(id, role, primary, limit, startingAfter, endingBefore)



Returns the staff, student, and/or teacher users for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
String role = "role_example"; // String | 
String primary = "primary_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getUsersForSchool(id, role, primary, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getUsersForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **role** | **String**|  | [optional] [enum: staff, student, teacher]
 **primary** | **String**|  | [optional] [enum: , true]
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersForSection"></a>
# **getUsersForSection**
> UsersResponse getUsersForSection(id, role, limit, startingAfter, endingBefore)



Returns the student and/or teacher users for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

DataApi apiInstance = new DataApi();
String id = "id_example"; // String | 
String role = "role_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    UsersResponse result = apiInstance.getUsersForSection(id, role, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#getUsersForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **role** | **String**|  | [optional] [enum: student, teacher]
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

