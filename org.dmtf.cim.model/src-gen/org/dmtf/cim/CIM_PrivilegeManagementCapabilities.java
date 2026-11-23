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
 * A representation of the model object '<em><b>CIM Privilege Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the capabilities of the Privilege Management Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getSharedPrivilegeSupported <em>Shared Privilege Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getActivitiesSupported <em>Activities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getActivityQualifiersSupported <em>Activity Qualifiers Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getQualifierFormatsSupported <em>Qualifier Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::User::Privilege' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrivilegeManagementCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Shared Privilege Supported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to TRUE if this PrivilegeManagementService supports association of multiple subjects or targets to a particular Privilege. If False, the AssignAccess method supports at most one entry each in the Subjects and Targets parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shared Privilege Supported</em>' attribute.
	 * @see #setSharedPrivilegeSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities_SharedPrivilegeSupported()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSharedPrivilegeSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrivilegeManagementCapabilities#getSharedPrivilegeSupported <em>Shared Privilege Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Privilege Supported</em>' attribute.
	 * @see #getSharedPrivilegeSupported()
	 * @generated
	 */
	void setSharedPrivilegeSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A super set of activities that could be granted or denied to a role or an identity by the associated privileges. The Activities property of the instances of CIM_Privilege that are associated to the role or the identity MUST contain only the values enumerated in the ActivitiesSupported array property. The supported activities apply to all entities specified in the ActivityQualifiersSupported array. Refer to the CIM_Privilege.Activities property for the detailed description of values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities_ActivitiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"16000..\"]' Values='[\"Other\",\"Create\",\"Delete\",\"Detect\",\"Read\",\"Write\",\"Execute\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PrivilegeManagementCapabilities.ActivityQualifiersSupported\"]'"
	 * @generated
	 */
	EList<Integer> getActivitiesSupported();

	/**
	 * Returns the value of the '<em><b>Activity Qualifiers Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityQualifiersSupported property is an array of string values used to further qualify and specify the supported activities of privileges. The ActivityQualifiers property of the instances of CIM_Privilege that are associated to the role or the identity MUST contain only the values enumerated in the ActivityQualifiersSupported array property. Details on the semantics of the individual entries in ActivityQualifiersSupported are provided by corresponding entries in the QualifierFormatsSupported array. Refer to the CIM_Privilege.ActivityQualifiers property for the detailed description of values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Qualifiers Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities_ActivityQualifiersSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PrivilegeManagementCapabilities.ActivitiesSupported\",\"CIM_Privilege.QualifierFormats\"]'"
	 * @generated
	 */
	EList<String> getActivityQualifiersSupported();

	/**
	 * Returns the value of the '<em><b>Qualifier Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the semantics of corresponding entries in the ActivityQualifierSupported array. The QualifierSupported property of the instances of CIM_Privilege that are associated to the role or the identity MUST contain only the values enumerated in the QualifierSupported array property. Refer to the CIM_Privilege.QualifierSupported property for the detailed description of values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities_QualifierFormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"16000..\"]' Values='[\"Class Name\",\"&lt;Class.&gt;Property\",\"&lt;Class.&gt;Method\",\"Object Reference\",\"Namespace\",\"URL\",\"Directory/File Name\",\"Command Line Instruction\",\"SCSI Command\",\"Packets\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Privilege.ActivityQualifiers\"]'"
	 * @generated
	 */
	EList<Integer> getQualifierFormatsSupported();

	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each enumeration corresponds to support for the like-named method of the PrivilegeManagementService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrivilegeManagementCapabilities_SupportedMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4..40\",\"..\",\"0x8000..\"]' Values='[\"ChangeAccess\",\"ShowAccess\",\"AssignAccess\",\"RevokeAccess\",\"DMTF Role Reserved\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedMethods();

} // CIM_PrivilegeManagementCapabilities
