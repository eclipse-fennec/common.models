/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Time Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TimeZone class is a set of properties defining a particular time zone. These properties include the concept of daylight saving time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getTimeZoneID <em>Time Zone ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getTimeZoneStartDate <em>Time Zone Start Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardName <em>Standard Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardCaption <em>Standard Caption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardOffset <em>Standard Offset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardMonth <em>Standard Month</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardDay <em>Standard Day</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardDayOfWeek <em>Standard Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getStandardStartInterval <em>Standard Start Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightName <em>Daylight Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightCaption <em>Daylight Caption</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightOffset <em>Daylight Offset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightMonth <em>Daylight Month</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightDay <em>Daylight Day</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightDayOfWeek <em>Daylight Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TimeZone#getDaylightStartInterval <em>Daylight Start Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::Time' keys='TimeZoneID,TimeZoneStartDate'"
 * @generated
 */
@ProviderType
public interface CIM_TimeZone extends CIM_Setting {
	/**
	 * Returns the value of the '<em><b>Time Zone ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time zone identifier. The Id MAY be expressed in the form 'area name/city name' (e.g., "America/New_York"), or as a time zone name (for example, EST or EDT).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Zone ID</em>' attribute.
	 * @see #setTimeZoneID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_TimeZoneID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getTimeZoneID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getTimeZoneID <em>Time Zone ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone ID</em>' attribute.
	 * @see #getTimeZoneID()
	 * @generated
	 */
	void setTimeZoneID(String value);

	/**
	 * Returns the value of the '<em><b>Time Zone Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time at which this time zone definition takes effect. The value is specified in UTC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Zone Start Date</em>' attribute.
	 * @see #setTimeZoneStartDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_TimeZoneStartDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Key='true'"
	 * @generated
	 */
	String getTimeZoneStartDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getTimeZoneStartDate <em>Time Zone Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone Start Date</em>' attribute.
	 * @see #getTimeZoneStartDate()
	 * @generated
	 */
	void setTimeZoneStartDate(String value);

	/**
	 * Returns the value of the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full name of the 'standard' time zone (e.g., "U.S. Eastern Standard Time"), suitable for presentation to the user in the default locale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Name</em>' attribute.
	 * @see #setStandardName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_TimeZone.StandardCaption\"]'"
	 * @generated
	 */
	String getStandardName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardName <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Name</em>' attribute.
	 * @see #getStandardName()
	 * @generated
	 */
	void setStandardName(String value);

	/**
	 * Returns the value of the '<em><b>Standard Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short name of the 'standard' time zone (e.g., "EST"), suitable for presentation to the user in the default locale. Note that a specific StandardCaption property is defined, instead of using the inherited Caption. This is done to force consistent property naming for the StandardXXX and DaylightXXX properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Caption</em>' attribute.
	 * @see #setStandardCaption(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardCaption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_TimeZone.StandardName\"]'"
	 * @generated
	 */
	String getStandardCaption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardCaption <em>Standard Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Caption</em>' attribute.
	 * @see #getStandardCaption()
	 * @generated
	 */
	void setStandardCaption(String value);

	/**
	 * Returns the value of the '<em><b>Standard Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of minutes by which this 'standard' time differs from UTC. For example, U.S. EST differs from UTC by -5.0 hours or -300 minutes, whereas Australia Adelaide Standard Time differs by 9.5 hours or 570 minutes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Offset</em>' attribute.
	 * @see #setStandardOffset(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardOffset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Units='Minutes'"
	 * @generated
	 */
	Integer getStandardOffset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardOffset <em>Standard Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Offset</em>' attribute.
	 * @see #getStandardOffset()
	 * @generated
	 */
	void setStandardOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Standard Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The month in which daylight saving time ends (and 'standard' time begins). Specify 0 for January, 1 for February, and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Month</em>' attribute.
	 * @see #setStandardMonth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardMonth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"]' ModelCorrespondence='[\"CIM_TimeZone.StandardDay\"]'"
	 * @generated
	 */
	Integer getStandardMonth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardMonth <em>Standard Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Month</em>' attribute.
	 * @see #getStandardMonth()
	 * @generated
	 */
	void setStandardMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Standard Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are two different interpretations for this property, depending on the value of StandardDayOfWeek. In one case, StandardDay defines the day-in-month on which daylight saving time ends. This interpretation is used when the StandardDayOfWeek is 0. A positive or negative integer is specified to indicate whether the StandardDay should be calculated from the beginning or the end of the month. For example, 5 indicates the fifth day in the StandardMonth and -1 indicates the last day in the StandardMonth. 
	 * 
	 * When StandardDayOfWeek is not 0, StandardDay is the day- in-month on which daylight saving time ends, defined in conjunction with StandardDayOfWeek. For example, if StandardDay is 15 and StandardDayOfWeek is Saturday, then daylight saving time ends on the first Saturday on or after the 15th day in the StandardMonth (i.e., the third Saturday in the month). If StandardDay is 20 and StandardDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the StandardMonth. If StandardDay is -1 and StandardDayOfWeek is -Sunday, then this indicates the last Sunday in the StandardMonth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Day</em>' attribute.
	 * @see #setStandardDay(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardDay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' MinValue='-31' MaxValue='31' ModelCorrespondence='[\"CIM_TimeZone.StandardDayOfWeek\"]'"
	 * @generated
	 */
	Integer getStandardDay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardDay <em>Standard Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Day</em>' attribute.
	 * @see #getStandardDay()
	 * @generated
	 */
	void setStandardDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Standard Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive or negative integer used in conjunction with StandardDay to indicate the day of the week on which daylight saving time ends (and 'standard' time begins). StandardDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified StandardDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or before the StandardDay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Day Of Week</em>' attribute.
	 * @see #setStandardDayOfWeek(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardDayOfWeek()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' ValueMap='[\"-7\",\"-6\",\"-5\",\"-4\",\"-3\",\"-2\",\"-1\",\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"-Saturday\",\"-Friday\",\"-Thursday\",\"-Wednesday\",\"-Tuesday\",\"-Monday\",\"-Sunday\",\"ExactDayOfMonth\",\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"]' ModelCorrespondence='[\"CIM_TimeZone.StandardDay\"]'"
	 * @generated
	 */
	Integer getStandardDayOfWeek();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardDayOfWeek <em>Standard Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Day Of Week</em>' attribute.
	 * @see #getStandardDayOfWeek()
	 * @generated
	 */
	void setStandardDayOfWeek(Integer value);

	/**
	 * Returns the value of the '<em><b>Standard Start Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval after midnight when daylight saving time ends. For example, 
	 * 00000000020000.000000:000 
	 * indicates that daylight saving time ends at two o'clock, local time (usually, daylight saving time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Start Interval</em>' attribute.
	 * @see #setStandardStartInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_StandardStartInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStandardStartInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getStandardStartInterval <em>Standard Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Start Interval</em>' attribute.
	 * @see #getStandardStartInterval()
	 * @generated
	 */
	void setStandardStartInterval(String value);

	/**
	 * Returns the value of the '<em><b>Daylight Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full name of the 'daylight' time zone (e.g., "U.S. Eastern Daylight Saving Time"), suitable for presentation to the user in the default locale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Name</em>' attribute.
	 * @see #setDaylightName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_TimeZone.DaylightCaption\"]'"
	 * @generated
	 */
	String getDaylightName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightName <em>Daylight Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Name</em>' attribute.
	 * @see #getDaylightName()
	 * @generated
	 */
	void setDaylightName(String value);

	/**
	 * Returns the value of the '<em><b>Daylight Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short name of the 'daylight' time zone (e.g., "EDT"), suitable for presentation to the user in the default locale. Note that a specific DaylightCaption property is defined, instead of using the inherited Caption. This is done to force consistent property naming for the StandardXXX and DaylightXXX properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Caption</em>' attribute.
	 * @see #setDaylightCaption(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightCaption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_TimeZone.DaylightName\"]'"
	 * @generated
	 */
	String getDaylightCaption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightCaption <em>Daylight Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Caption</em>' attribute.
	 * @see #getDaylightCaption()
	 * @generated
	 */
	void setDaylightCaption(String value);

	/**
	 * Returns the value of the '<em><b>Daylight Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of minutes by which this daylight saving time differs from UTC. For example, U.S. EDT differs from UTC by -4.0 hours or -240 minutes, whereas Australia Adelaide Daylight Time differs by 10.5 hours or 630 minutes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Offset</em>' attribute.
	 * @see #setDaylightOffset(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightOffset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' Units='Minutes'"
	 * @generated
	 */
	Integer getDaylightOffset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightOffset <em>Daylight Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Offset</em>' attribute.
	 * @see #getDaylightOffset()
	 * @generated
	 */
	void setDaylightOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Daylight Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The month in which daylight saving time starts. Specify 0 for January, 1 for February, and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Month</em>' attribute.
	 * @see #setDaylightMonth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightMonth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"]' ModelCorrespondence='[\"CIM_TimeZone.DaylightDay\"]'"
	 * @generated
	 */
	Integer getDaylightMonth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightMonth <em>Daylight Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Month</em>' attribute.
	 * @see #getDaylightMonth()
	 * @generated
	 */
	void setDaylightMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Daylight Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are two different interpretations for this property, depending on the value of DaylightDayOfWeek. In one case, DaylightDay defines the day-in-month on which daylight saving time starts. This interpretation is used when the DaylightDayOfWeek is 0. A positive or negative integer is specified to indicate whether the DaylightDay should be calculated from the beginning or the end of the month. For example, 5 indicates the fifth day in the DaylightMonth and -1 indicates the last day in the DaylightMonth. 
	 * 
	 * When DaylightDayOfWeek is not 0, DaylightDay is the day- in-month on which daylight saving time starts, defined in conjunction with DaylightDayOfWeek. For example, if DaylightDay is 15 and DaylightDayOfWeek is Saturday, then daylight saving time starts on the first Saturday on or after the 15th day in the DaylightMonth (i.e., the third Saturday in the month). If DaylightDay is 20 and DaylightDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the DaylightMonth. If DaylightDay is -1 and DaylightDayOfWeek is -Sunday, then this indicates the last Sunday in the month.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Day</em>' attribute.
	 * @see #setDaylightDay(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightDay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' MinValue='-31' MaxValue='31' ModelCorrespondence='[\"CIM_TimeZone.DaylightDayOfWeek\"]'"
	 * @generated
	 */
	Integer getDaylightDay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightDay <em>Daylight Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Day</em>' attribute.
	 * @see #getDaylightDay()
	 * @generated
	 */
	void setDaylightDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Daylight Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive or negative integer used in conjunction with DaylightDay to indicate the day of the week on which daylight saving time starts. Set DaylightDayOfWeek to 0 to indicate an exact day of month, such as March 1. Positive integer (Sunday, Monday, ..., Saturday) means that the day of week is found on or after DaylightDay. Negative integer (-Sunday, -Monday, ..., -Saturday) means that the day of week is found on or before DaylightDay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Day Of Week</em>' attribute.
	 * @see #setDaylightDayOfWeek(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightDayOfWeek()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' ValueMap='[\"-7\",\"-6\",\"-5\",\"-4\",\"-3\",\"-2\",\"-1\",\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"-Saturday\",\"-Friday\",\"-Thursday\",\"-Wednesday\",\"-Tuesday\",\"-Monday\",\"-Sunday\",\"ExactDayOfMonth\",\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"]' ModelCorrespondence='[\"CIM_TimeZone.DaylightDay\"]'"
	 * @generated
	 */
	Integer getDaylightDayOfWeek();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightDayOfWeek <em>Daylight Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Day Of Week</em>' attribute.
	 * @see #getDaylightDayOfWeek()
	 * @generated
	 */
	void setDaylightDayOfWeek(Integer value);

	/**
	 * Returns the value of the '<em><b>Daylight Start Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval after midnight when daylight saving time starts. For example, 
	 * 00000000020000.000000:000 
	 * indicates that daylight saving time starts at two o'clock, local time (usually, standard time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daylight Start Interval</em>' attribute.
	 * @see #setDaylightStartInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_TimeZone_DaylightStartInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getDaylightStartInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TimeZone#getDaylightStartInterval <em>Daylight Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Start Interval</em>' attribute.
	 * @see #getDaylightStartInterval()
	 * @generated
	 */
	void setDaylightStartInterval(String value);

} // CIM_TimeZone
