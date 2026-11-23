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
 * A representation of the model object '<em><b>CIM Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Setting class represents configuration-related and operational parameters for one or more ManagedSystemElements. An Element can have multiple Setting objects associated with it. The current operational values for the parameters of an Element are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values present in the Setting object. For example, a modem might have a Setting baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
 * Note: The CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information. Setting instances can be aggregated together into higher-level Setting objects using ConcreteComponent associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Setting#getSettingID <em>Setting ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Setting()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.1000' UMLPackagePath='CIM::Core::Settings'"
 * @generated
 */
@ProviderType
public interface CIM_Setting extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Setting ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier by which the Setting object is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting ID</em>' attribute.
	 * @see #setSettingID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Setting_SettingID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getSettingID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Setting#getSettingID <em>Setting ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting ID</em>' attribute.
	 * @see #getSettingID()
	 * @generated
	 */
	void setSettingID(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VerifyOKToApplyToMSE method is used to verify that this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes three input parameters: MSE (the Managed SystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
	 * @param MSE The ManagedSystemElement that is being verified.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * <!-- end-model-doc -->
	 * @model MSEAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long VerifyOKToApplyToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ApplyToMSE method performs the actual application of the Setting to the referenced ManagedSystemElement. It takes three input parameters: MSE (the ManagedSystemElement to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
	 * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
	 * @param MSE The ManagedSystemElement to which the Setting is being applied.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * <!-- end-model-doc -->
	 * @model MSEAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ApplyToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VerifyOKToApplyToCollection method is used to verify that this Setting can be applied to the referenced Collection of ManagedSystemElements, at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApply method against each of the Elements that are aggregated by the Collection. This method takes three input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
	 * @param Collection The Collection of ManagedSystemElements that is being verified.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * @param CanNotApply A string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied.
	 * <!-- end-model-doc -->
	 * @model CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" CanNotApplyUnique="false" CanNotApplyMany="true"
	 *        CanNotApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long VerifyOKToApplyToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, String MustBeCompletedBy, EList<String> CanNotApply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ApplyToCollection method performs the application of the Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error. In the case of an error, the method stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
	 * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
	 * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
	 * @param Collection The Collection of ManagedSystemElements to be applied.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param ContinueOnError True means to continue processing when an error is encountered.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * @param CanNotApply A string array that lists the keys of the ManagedSystemElements to which the Setting could not be applied.
	 * <!-- end-model-doc -->
	 * @model CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" ContinueOnErrorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" CanNotApplyUnique="false" CanNotApplyMany="true"
	 *        CanNotApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ApplyToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, Boolean ContinueOnError, String MustBeCompletedBy, EList<String> CanNotApply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VerifyOKToApplyIncrementalChangeToMSE method is used to verify that a subset of the properties in this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes four input parameters: MSE (the ManagedSystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be verified. If it is set to "NONE", then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
	 * @param MSE The ManagedSystemElement for which the Setting is being verified.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * @param PropertiesToApply A list of the property names whose values will be verified.
	 * <!-- end-model-doc -->
	 * @model MSEAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" PropertiesToApplyUnique="false" PropertiesToApplyMany="true"
	 *        PropertiesToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long VerifyOKToApplyIncrementalChangeToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ApplyIncrementalChangeToMSE method performs the actual application of a subset of the properties in the Setting to the referenced ManagedSystemElement. It takes four input parameters: MSE (the ManagedSystem Element to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null, empty, or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
	 * Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
	 * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
	 * @param MSE The ManagedSystemElement to which the Setting is being applied.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * @param PropertiesToApply A list of the property names whose values will be applied.
	 * <!-- end-model-doc -->
	 * @model MSEAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" PropertiesToApplyUnique="false" PropertiesToApplyMany="true"
	 *        PropertiesToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ApplyIncrementalChangeToMSE(CIM_ManagedSystemElement MSE, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VerifyOKToApplyIncrementalChangeToCollection method is used to verify that a subset of the properties in this Setting can be applied to the referenced Collection of ManagedSystemElements at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. This method takes four input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "all" as a property name, all Settings properties will be verified. If it is set to "none" then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
	 * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
	 * @param Collection The Collection of ManagedSystemElements for which the setting is being verified.
	 * @param TimeToApply TimeToApply can be either a specific time or a time interval.
	 * @param MustBeCompletedBy The required completion time for the method.
	 * @param PropertiesToApply A list of the property names whose values will be verified.
	 * @param CanNotApply A string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied.
	 * <!-- end-model-doc -->
	 * @model CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" PropertiesToApplyUnique="false" PropertiesToApplyMany="true"
	 *        PropertiesToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'" CanNotApplyUnique="false" CanNotApplyMany="true"
	 *        CanNotApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long VerifyOKToApplyIncrementalChangeToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, String MustBeCompletedBy, EList<String> PropertiesToApply, EList<String> CanNotApply);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ApplyIncrementalChangeToCollection method performs the application of a subset of the properties in this Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error, in which case it stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
	 * The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified time, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
	 * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
	 * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
	 * @param Collection The Collection of Elements to which the Setting is being applied.
	 * @param TimeToApply A specific time or a time interval.
	 * @param ContinueOnError True indicates to continue processing when an error is encountered.
	 * @param MustBeCompletedBy This parameter indicates the required completion time for the method.
	 * @param PropertiesToApply A list of the property names whose values will be verified.
	 * @param CanNotApply A string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied.
	 * <!-- end-model-doc -->
	 * @model CollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' In='true'" TimeToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" ContinueOnErrorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" MustBeCompletedByAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'" PropertiesToApplyUnique="false" PropertiesToApplyMany="true"
	 *        PropertiesToApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='true'" CanNotApplyUnique="false" CanNotApplyMany="true"
	 *        CanNotApplyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long ApplyIncrementalChangeToCollection(CIM_CollectionOfMSEs Collection, String TimeToApply, Boolean ContinueOnError, String MustBeCompletedBy, EList<String> PropertiesToApply, EList<String> CanNotApply);

} // CIM_Setting
