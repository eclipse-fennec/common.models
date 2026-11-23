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
 * A representation of the model object '<em><b>CIM Diagnostic Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data related to Diagnostics may be recorded in various DiagnosticRecord objects. The type of information that is recorded in a log is specified via the LogOptions property in DiagnosticSetting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getManagedElementName <em>Managed Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getOtherRecordTypeDescription <em>Other Record Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticRecord#getCreationTimeStamp <em>Creation Time Stamp</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::System::Diagnostics' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticRecord extends CIM_RecordForLog {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property should reflect the value of the underlying DiagnosticService.Name property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_DiagnosticService.Name\"]'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Managed Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property SHOULD reflect the value of the underlying ManagedElement.ElementName property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element Name</em>' attribute.
	 * @see #setManagedElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_ManagedElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_ManagedElement.ElementName\"]'"
	 * @generated
	 */
	String getManagedElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getManagedElementName <em>Managed Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element Name</em>' attribute.
	 * @see #getManagedElementName()
	 * @generated
	 */
	void setManagedElementName(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the record instance should be deleted. The expiration datetime SHOULD be set when the record is fully populated with record data. The value SHOULD be calculated using the ResultPersistence property of the DiagnosticSetting class. Once the Expiration Date has been reached, record instances SHOULD be deleted as soon as possible.
	 * If a ResultPersistence value is not provided, records MAY be deleted at any time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_ExpirationDate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_DiagnosticSetting.ResultPersistence\"]'"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Record Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RecordType property specifies the nature of the data being entered into the ServiceRecord. The value in this property should match one of the values indicated by the DiagnosticSetting.LogOptions property. A brief summary of the various log options can be found in CIM_DiagnosticSetting.LogOptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Type</em>' attribute.
	 * @see #setRecordType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_RecordType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\"]' Values='[\"Unknown\",\"Other\",\"Results\",\"Subtests\",\"Actions\",\"Warnings\",\"Status\",\"Device Errors\",\"Service Errors\",\"Setting Data\",\"Statistics\",\"Hardware Configuration\",\"Software Configuration\",\"References\",\"Debug\"]' ModelCorrespondence='[\"CIM_DiagnosticSetting.LogOptions\",\"CIM_DiagnosticRecord.OtherRecordTypeDescription\"]'"
	 * @generated
	 */
	Integer getRecordType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getRecordType <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Type</em>' attribute.
	 * @see #getRecordType()
	 * @generated
	 */
	void setRecordType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Record Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When "Other" (value=1) is entered in the RecordType property, OtherRecordTypeDescription can be used to describe the message type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Record Type Description</em>' attribute.
	 * @see #setOtherRecordTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_OtherRecordTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DiagnosticSetting.OtherLogOptionsDescriptions\",\"CIM_DiagnosticRecord.RecordType\"]'"
	 * @generated
	 */
	String getOtherRecordTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getOtherRecordTypeDescription <em>Other Record Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Record Type Description</em>' attribute.
	 * @see #getOtherRecordTypeDescription()
	 * @generated
	 */
	void setOtherRecordTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A timestamp indicating when the record was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Time Stamp</em>' attribute.
	 * @see #setCreationTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticRecord_CreationTimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCreationTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticRecord#getCreationTimeStamp <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time Stamp</em>' attribute.
	 * @see #getCreationTimeStamp()
	 * @generated
	 */
	void setCreationTimeStamp(String value);

} // CIM_DiagnosticRecord
