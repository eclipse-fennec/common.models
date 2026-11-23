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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Policy Time Period Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class provides a means of representing the time periods during which a PolicySet is valid, i.e., active. At all times that fall outside these time periods, the PolicySet has no effect. A PolicySet is treated as valid at ALL times, if it does not specify a PolicyTimePeriodCondition. 
 * 
 * In some cases a Policy Consumer may need to perform certain setup / cleanup actions when a PolicySet becomes active / inactive. For example, sessions that were established while a PolicySet was active might need to be taken down when the PolicySet becomes inactive. In other cases, however, such sessions might be left up. In this case, the effect of deactivating the PolicySet would just be to prevent the establishment of new sessions. 
 * 
 * Setup / cleanup behaviors on validity period transitions are not currently addressed by the Policy Model, and must be specified in 'guideline' documents or via subclasses of CIM_PolicySet, CIM_PolicyTimePeriod Condition or other concrete subclasses of CIM_Policy. If such behaviors need to be under the control of the policy administrator, then a mechanism to allow this control must also be specified in the subclasses. 
 * 
 * PolicyTimePeriodCondition is defined as a subclass of PolicyCondition. This is to allow the inclusion of time-based criteria in the AND/OR condition definitions for a PolicyRule. 
 * 
 * Instances of this class may have up to five properties identifying time periods at different levels. The values of all the properties present in an instance are ANDed together to determine the validity period(s) for the instance. For example, an instance with an overall validity range of January 1, 2000 through December 31, 2000; a month mask that selects March and April; a day-of-the-week mask that selects Fridays; and a time of day range of 0800 through 1600 would be represented using the following time periods: 
 * Friday, March 5, 2000, from 0800 through 1600; 
 * Friday, March 12, 2000, from 0800 through 1600; 
 * Friday, March 19, 2000, from 0800 through 1600; 
 * Friday, March 26, 2000, from 0800 through 1600; 
 * Friday, April 2, 2000, from 0800 through 1600; 
 * Friday, April 9, 2000, from 0800 through 1600; 
 * Friday, April 16, 2000, from 0800 through 1600; 
 * Friday, April 23, 2000, from 0800 through 1600; 
 * Friday, April 30, 2000, from 0800 through 1600. 
 * 
 * Properties not present in an instance of PolicyTimePeriodCondition are implicitly treated as having their value 'always enabled'. Thus, in the example above, the day-of-the-month mask is not present, and so the validity period for the instance implicitly includes a day-of-the-month mask that selects all days of the month. If this 'missing property' rule is applied to its fullest, we see that there is a second way to indicate that a PolicySet is always enabled: associate with it an instance of PolicyTimePeriodCondition whose only properties with specific values are its key properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getMonthOfYearMask <em>Month Of Year Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getDayOfMonthMask <em>Day Of Month Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getDayOfWeekMask <em>Day Of Week Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getTimeOfDayMask <em>Time Of Day Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getLocalOrUtcTime <em>Local Or Utc Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyTimePeriodCondition extends CIM_PolicyCondition {
	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies an overall range of calendar dates and times over which a PolicySet is valid. It is formatted as a string representing a start date and time, in which the character 'T' indicates the beginning of the time portion, followed by the solidus character '/', followed by a similar string representing an end date and time. The first date indicates the beginning of the range, while the second date indicates the end. Thus, the second date and time must be later than the first. Date/times are expressed as substrings of the form yyyymmddThhmmss. For example: 
	 * 20000101T080000/20000131T120000 defines 
	 * January 1, 2000, 0800 through January 31, 2000, noon 
	 * 
	 * There are also two special cases in which one of the date/time strings is replaced with a special string defined in RFC 2445. 
	 * o If the first date/time is replaced with the string 'THISANDPRIOR', then the property indicates that a PolicySet is valid [from now] until the date/time that appears after the '/'. 
	 * o If the second date/time is replaced with the string 'THISANDFUTURE', then the property indicates that a PolicySet becomes valid on the date/time that appears before the '/', and remains valid from that point on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' attribute.
	 * @see #setTimePeriod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_TimePeriod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.MonthOfYearMask\",\"CIM_PolicyTimePeriodCondition.DayOfMonthMask\",\"CIM_PolicyTimePeriodCondition.DayOfWeekMask\",\"CIM_PolicyTimePeriodCondition.TimeOfDayMask\",\"CIM_PolicyTimePeriodCondition.LocalOrUtcTime\"]'"
	 * @generated
	 */
	String getTimePeriod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(String value);

	/**
	 * Returns the value of the '<em><b>Month Of Year Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which months the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the MonthOfYearMask used to pick out the months during which the PolicySet is valid. 
	 * 
	 * This property is formatted as an octet string, structured as follows: 
	 * o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x00000006 for this property; 
	 * o a 2-octet field consisting of 12 bits identifying the 12 months of the year, beginning with January and ending with December, followed by 4 bits that are always set to '0'. For each month, the value '1' indicates that the policy is valid for that month, and the value '0' indicates that it is not valid. 
	 * 
	 * The value 0x000000060830, for example, indicates that a PolicySet is valid only in the months May, November, and December. 
	 * 
	 * If a value for this property is not provided, then the PolicySet is treated as valid for all twelve months, and only restricted by its TimePeriod property value and the other Mask properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month Of Year Mask</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_MonthOfYearMask()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.TimePeriod\",\"CIM_PolicyTimePeriodCondition.LocalOrUtcTime\"]'"
	 * @generated
	 */
	EList<Integer> getMonthOfYearMask();

	/**
	 * Returns the value of the '<em><b>Day Of Month Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which days of the month the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the DayOfMonthMask used to pick out the days of the month during which the PolicySet is valid. 
	 * 
	 * This property is formatted as an octet string, structured as follows: 
	 * o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x0000000C for this property; 
	 * o an 8-octet field consisting of 31 bits identifying the days of the month counting from the beginning, followed by 31 more bits identifying the days of the month counting from the end, followed by 2 bits that are always set to '0'. For each day, the value '1' indicates that the PolicySet is valid for that day, and the value '0' indicates that it is not valid. 
	 * 
	 * The value 0x0000000C8000000100000000, for example, indicates that a PolicySet is valid on the first and last days of the month. 
	 * 
	 * For months with fewer than 31 days, the digits corresponding to days that the months do not have (counting in both directions) are ignored. 
	 * 
	 * If a value for this property is not provided, then the PolicySet is treated as valid for all days of the month, and only restricted by its TimePeriod property value and the other Mask properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Of Month Mask</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_DayOfMonthMask()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.TimePeriod\",\"CIM_PolicyTimePeriodCondition.LocalOrUtcTime\"]'"
	 * @generated
	 */
	EList<Integer> getDayOfMonthMask();

	/**
	 * Returns the value of the '<em><b>Day Of Week Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying in which days of the week the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the DayOfWeekMask used to pick out the days of the week during which the PolicySet is valid. 
	 * 
	 * This property is formatted as an octet string, structured as follows: 
	 * o a 4-octet length field, indicating the length of the entire octet string; this field is always set to 0x00000005 for this property; 
	 * o a 1-octet field consisting of 7 bits identifying the 7 days of the week, beginning with Sunday and ending with Saturday, followed by 1 bit that is always set to '0'. For each day of the week, the value '1' indicates that the PolicySet is valid for that day, and the value '0' indicates that it is not valid. 
	 * 
	 * The value 0x000000057C, for example, indicates that a PolicySet is valid Monday through Friday. 
	 * 
	 * If a value for this property is not provided, then the PolicySet is treated as valid for all days of the week, and only restricted by its TimePeriod property value and the other Mask properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Of Week Mask</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_DayOfWeekMask()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.TimePeriod\",\"CIM_PolicyTimePeriodCondition.LocalOrUtcTime\"]'"
	 * @generated
	 */
	EList<Integer> getDayOfWeekMask();

	/**
	 * Returns the value of the '<em><b>Time Of Day Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The purpose of this property is to refine the valid time period that is defined by the TimePeriod property, by explicitly specifying a range of times in a day during which the PolicySet is valid. These properties work together, with the TimePeriod used to specify the overall time period in which the PolicySet is valid, and the TimeOfDayMask used to pick out the range of time periods in a given day of during which the PolicySet is valid. 
	 * 
	 * This property is formatted in the style of RFC 2445: a time string beginning with the character 'T', followed by the solidus character '/', followed by a second time string. The first time indicates the beginning of the range, while the second time indicates the end. Times are expressed as substrings of the form 'Thhmmss'. 
	 * 
	 * The second substring always identifies a later time than the first substring. To allow for ranges that span midnight, however, the value of the second string may be smaller than the value of the first substring. Thus, 'T080000/T210000' identifies the range from 0800 until 2100, while 'T210000/T080000' identifies the range from 2100 until 0800 of the following day. 
	 * 
	 * When a range spans midnight, it by definition includes parts of two successive days. When one of these days is also selected by either the MonthOfYearMask, DayOfMonthMask, and/or DayOfWeekMask, but the other day is not, then the PolicySet is active only during the portion of the range that falls on the selected day. For example, if the range extends from 2100 until 0800, and the day of week mask selects Monday and Tuesday, then the PolicySet is active during the following three intervals: 
	 * From midnight Sunday until 0800 Monday; 
	 * From 2100 Monday until 0800 Tuesday; 
	 * From 2100 Tuesday until 23:59:59 Tuesday. 
	 * 
	 * If a value for this property is not provided, then the PolicySet is treated as valid for all hours of the day, and only restricted by its TimePeriod property value and the other Mask properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Day Mask</em>' attribute.
	 * @see #setTimeOfDayMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_TimeOfDayMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.TimePeriod\",\"CIM_PolicyTimePeriodCondition.LocalOrUtcTime\"]'"
	 * @generated
	 */
	String getTimeOfDayMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getTimeOfDayMask <em>Time Of Day Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Day Mask</em>' attribute.
	 * @see #getTimeOfDayMask()
	 * @generated
	 */
	void setTimeOfDayMask(String value);

	/**
	 * Returns the value of the '<em><b>Local Or Utc Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the times represented in the TimePeriod property and in the various Mask properties represent local times or UTC times. There is no provision for mixing of local times and UTC times: the value of this property applies to all of the other time-related properties. TimePeriods are synchronized worldwide by using the enumeration value 'UTCTime'. If the goal is to synchronize worldwide on a particular local time (such as 0300 - 0500 in New York), then if the TimePeriod property spans a Daylight Savings Time transition in New York, it will be necessary to create multiple instances of PolicyTimePeriodCondition, one based on the offset UTC-0500 for the part of each year when standard time is used in New York, and one based on the offset UTC-0400 for the part of each year when Daylight Savings Time is used there.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Or Utc Time</em>' attribute.
	 * @see #setLocalOrUtcTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyTimePeriodCondition_LocalOrUtcTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Local Time\",\"UTC Time\"]' ModelCorrespondence='[\"CIM_PolicyTimePeriodCondition.TimePeriod\",\"CIM_PolicyTimePeriodCondition.MonthOfYearMask\",\"CIM_PolicyTimePeriodCondition.DayOfMonthMask\",\"CIM_PolicyTimePeriodCondition.DayOfWeekMask\",\"CIM_PolicyTimePeriodCondition.TimeOfDayMask\"]'"
	 * @generated
	 */
	Integer getLocalOrUtcTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyTimePeriodCondition#getLocalOrUtcTime <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Or Utc Time</em>' attribute.
	 * @see #getLocalOrUtcTime()
	 * @generated
	 */
	void setLocalOrUtcTime(Integer value);

} // CIM_PolicyTimePeriodCondition
