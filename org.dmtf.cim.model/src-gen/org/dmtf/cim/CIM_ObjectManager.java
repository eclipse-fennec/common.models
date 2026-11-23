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
 * A representation of the model object '<em><b>CIM Object Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ObjectManager is deprecated. The replacement is CIM_WBEMServer.
 * A type of CIM_Service that defines the capabilities of the CIM Server in which this ObjectManager class resides. Details related to communicating with the ObjectManager, and the Manager's basic capabilities, are stored in instances of the associated CommunicationMechanism class available through the CommMechanismForManager association. It is assumed that Basic Read operations must be supported by all ObjectManager's in order to retrieve any additional detail.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ObjectManager#getGatherStatisticalData <em>Gather Statistical Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManager()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_WBEMServer\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' override.Name='string' override.Name.Deprecated='[\"CIM_WBEMServer.Name\"]' override.Name.Description='The Name property is used to uniquely identify a CIM Server. The CIM Server MUST ensure that this value is globally unique. In order to ensure uniqueness, this value SHOULD be constructed in the following manner. &lt;Vendor ID&gt;:&lt;Unique ID&gt; \n&lt;Vendor ID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or a registered ID that is assigned to the business entity that is defining the Name. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) The purpose of &lt;Vendor ID&gt; is to ensure that &lt;ID&gt; is truly unique across multiple vendor implementations. If such a name is not used, the defining entity MUST assure that the &lt;ID&gt; portion of the Instance ID is unique when compared with other instance providers. For DMTF defined instances, the &lt;Vendor ID&gt; is \'CIM\'. \n&lt;Unique ID&gt; MUST include a vendor specified unique identifier. \nNote: Name is semantically the same as InstanceID. In the next major version of the CIM Schema, Name will be renamed to InstanceID and become the only key of this class.' override.ElementName='string' override.ElementName.Deprecated='[\"CIM_WBEMServer.ElementName\"]' override.ElementName.Description='The ElementName property is used as a name of the CIM Server for human interfaces. For example, \"ACME CIM Server\"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.' override.Description='string' override.Description.Deprecated='[\"CIM_WBEMServer.Description\"]' override.Description.Description='The description property is used as a description of the CIM Server for human interfaces. For example, \" ACME CIM Server version 2.2\"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ObjectManager extends CIM_WBEMService {
	/**
	 * Returns the value of the '<em><b>Gather Statistical Data</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GatherStatisticalData property is used to control the gathering of statistical data made accessible through the CIM_CIMOMStatisticalData objects. If set to true, the data is gathered and can be accessed. If false, the CIM_CIMOMStatisticalData instance MAY exist but MUST show zero values for the counter properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gather Statistical Data</em>' attribute.
	 * @see #setGatherStatisticalData(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ObjectManager_GatherStatisticalData()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]' Write='true'"
	 * @generated
	 */
	Boolean getGatherStatisticalData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ObjectManager#getGatherStatisticalData <em>Gather Statistical Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gather Statistical Data</em>' attribute.
	 * @see #getGatherStatisticalData()
	 * @generated
	 */
	void setGatherStatisticalData(Boolean value);

} // CIM_ObjectManager
