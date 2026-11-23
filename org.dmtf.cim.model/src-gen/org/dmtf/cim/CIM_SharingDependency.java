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
 * A representation of the model object '<em><b>CIM Sharing Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In some configurations, a logical device may be shared among multiple systems while only belonging to one. When modeling this sharing relationship, one instance of LogicalDevice exists to model the resource. This instance is associated with the owning system via the SystemDevice association. An additional instance of LogicalDevice will exist for each system the device is shared with to represent the device in the context of each System it is shared with. Each of these instances is associated with a single instance of System via an instance of the SystemDevice association. This is very similar to the way that virtual devices are modeled. However, there are additional semantics associated with shared devices that need to be modeled, including the current access of a sharing system to the shared device. The SharingDependency association will be used to add support for modeling this additional semantic. It is used to associate a LogicalDevice instance in the sharing system to the LogicalDevice representing the underlying shared resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SharingDependency#getCurrentAccess <em>Current Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SharingDependency#getOtherCurrentAccess <em>Other Current Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SharingDependency()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::Device::SCSI' override.Antecedent='CIM_LogicalDevice REF' override.Antecedent.Max='1' override.Antecedent.Description='The shared LogicalDevice.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice owned by the sharing System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SharingDependency extends CIM_HostedDependency {
	/**
	 * Returns the value of the '<em><b>Current Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CurrentAccess describes the current ability of the System owning the Dependent LogicalDevice to access the shared device. This property does not model whether or not the referenced System is authorized to utilize the shared resource. It is intended to model the current sharing relationship the system has to the device. Authorization for a user or service running within the system would be modeled identical to if the resource was owned exclusively by the system. However, the ability of an authorized user to utilize a shared resource is contingent on the System having access to the shared resource. 
	 * Unknown (0) indicates that the current access of the System to the shared resource is unknown 
	 * No Access (1) indicates that the System currently does not have access to the shared resource 
	 * Exclusive Access (2) indicates that the System has exclusive access to the shared resource. The resource is effectively locked. Granting another System access to the shared resource will cause this system to lose access. 
	 * Shared Read (3) indicates that the System is accessing the resource in a read only mode. Other Systems can have concurrent access to the device of type "Shared Read" or "Shared Full" 
	 * Shared Full (4) indicates that the System is accessing the resource in read/write mode. Other Systems can have concurrent access to the device of type "Shared Read" or "Shared Full".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Access</em>' attribute.
	 * @see #setCurrentAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SharingDependency_CurrentAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"No Access\",\"Exclusive Access\",\"Shared Read\",\"Shared Full\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SharingDependency.OtherCurrentAccess\",\"CIM_DeviceSharingCapabilities.SupportedAccessModes\"]'"
	 * @generated
	 */
	Integer getCurrentAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SharingDependency#getCurrentAccess <em>Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Access</em>' attribute.
	 * @see #getCurrentAccess()
	 * @generated
	 */
	void setCurrentAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Current Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string value describing CurrentAccess when it has a value of "1 (Other)".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Current Access</em>' attribute.
	 * @see #setOtherCurrentAccess(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SharingDependency_OtherCurrentAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SharingDependency.CurrentAccess\"]'"
	 * @generated
	 */
	String getOtherCurrentAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SharingDependency#getOtherCurrentAccess <em>Other Current Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Current Access</em>' attribute.
	 * @see #getOtherCurrentAccess()
	 * @generated
	 */
	void setOtherCurrentAccess(String value);

} // CIM_SharingDependency
