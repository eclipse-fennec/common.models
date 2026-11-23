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
 * A representation of the model object '<em><b>CIM Implementation Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ImplementationCapabilities identifies the capabilities of the implementation of a set of classes scoped by a scoping system or a central class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ImplementationCapabilities#getSupportedCapacityOptimizations <em>Supported Capacity Optimizations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ImplementationCapabilities#getSupportedViews <em>Supported Views</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ImplementationCapabilities#getSupportedElementNameCodeSet <em>Supported Element Name Code Set</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ImplementationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.43.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ImplementationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Capacity Optimizations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedCapacityOptimizations is an array of strings that identify the capacity optimization techniques that are supported within the scoped system or central class element.
	 * A string element in this array should take the form of <OrgID>:<COname>, where <OrgID> is the identifier of the organization that defined the technique and <COname> is the name of the capacity optimization technique.
	 * If no capacity optimization technique is supported by the implementation, then the array should have a single value of "None".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Capacity Optimizations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ImplementationCapabilities_SupportedCapacityOptimizations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSupportedCapacityOptimizations();

	/**
	 * Returns the value of the '<em><b>Supported Views</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an array of strings that identify the views that are supported by name, without the namespace qualifier.
	 * A string element in this array should take the form of <OrgID>:<viewname>, where <OrgID> is the identifier of the organization that defined the view and <viewname> is the name of the view.
	 * For example, support for the DiskDriveView would be indicated by the string "SNIA:DiskDriveView".
	 * If no views are supported by the implementation, then the array should have a single value of "None".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Views</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ImplementationCapabilities_SupportedViews()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSupportedViews();

	/**
	 * Returns the value of the '<em><b>Supported Element Name Code Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the supported character code set for the ElementName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Element Name Code Set</em>' attribute.
	 * @see #setSupportedElementNameCodeSet(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ImplementationCapabilities_SupportedElementNameCodeSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Single Byte ASCII\",\"UTF-8\",\"UTF-16\",\"UTF-32\",\"ISO 8859-1\",\"ISO 8859-2\",\"ISO 8859-3\",\"ISO 8859-4\",\"ISO 8859-5\",\"ISO 8859-6\",\"ISO 8859-7\",\"ISO 8859-8\",\"ISO 8859-9\",\"ISO 8859-10\",\"ISO 8859-11\",\"ISO 8859-12\",\"ISO 8859-13\",\"ISO 8859-14\",\"ISO 8859-15\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ManagedElement.ElementName\"]'"
	 * @generated
	 */
	Integer getSupportedElementNameCodeSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ImplementationCapabilities#getSupportedElementNameCodeSet <em>Supported Element Name Code Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Element Name Code Set</em>' attribute.
	 * @see #getSupportedElementNameCodeSet()
	 * @generated
	 */
	void setSupportedElementNameCodeSet(Integer value);

} // CIM_ImplementationCapabilities
