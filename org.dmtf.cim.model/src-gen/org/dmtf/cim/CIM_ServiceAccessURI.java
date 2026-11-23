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
 * A representation of the model object '<em><b>CIM Service Access URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ServiceAccessURI represents the ability to utilize or invoke a Service using a uniform resource identifier (URI). RFC 1738 describes the Uniform Resource Locator, which is a more specific form of a URI, and RFC 2396 describes the broader, inclusive URI. The following explanation is from the RFC: "A Uniform Resource Identifier (URI) is a compact string of characters for identifying an abstract or physical resource." In the context of a ServiceAccessPoint, a URI contains the information necessary to access an associated service (associated through ServiceAccessBySAP), using a syntax that is specific to that service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAccessURI#getLabeledURI <em>Labeled URI</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAccessURI()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Core::Service' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAccessURI extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Labeled URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LabeledURI property is based on RFC 2079 and its value and syntax are service-specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labeled URI</em>' attribute.
	 * @see #setLabeledURI(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAccessURI_LabeledURI()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MaxLen='256'"
	 * @generated
	 */
	String getLabeledURI();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAccessURI#getLabeledURI <em>Labeled URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled URI</em>' attribute.
	 * @see #getLabeledURI()
	 * @generated
	 */
	void setLabeledURI(String value);

} // CIM_ServiceAccessURI
