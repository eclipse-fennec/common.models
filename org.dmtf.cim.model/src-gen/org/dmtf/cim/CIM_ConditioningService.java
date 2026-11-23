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
 * A representation of the model object '<em><b>CIM Conditioning Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConditioningService represents the ability to define how traffic is conditioned in the data-forwarding path of a device. The subclasses of ConditioningService define the particular types of conditioning that are done. These are the services performed by a classifier, a meter, a marker, a dropper, a queue, and a scheduler. Other, more sophisticated types of conditioning may be defined in the future. 
 * 
 * ConditioningService is a concrete class because its superclass (ForwardingService) is concrete. While this class can be instantiated, an instance of it does not accomplish anything, because the nature of the conditioning, and the parameters that control it, are specified only in the subclasses of ConditioningService. 
 * 
 * Two associations in which ConditioningService participates are critical to its usage in QoS - QoSConditioningSubService and NextService. QoSConditioningSubService aggregates ConditioningServices into a particular QoS service (such as AF), to describe the specific conditioning functionality that underlies that QoSService in a particular device. NextService indicates the subsequent conditioning service(s) for different traffic streams.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConditioningService#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConditioningService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ConditioningService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a boolean that, if TRUE, signifies that one or more conditioning functions can be performed on traffic encountered by this ConditioningService. This allows one or more ConditioningServices to be enabled or disabled to provide different types of conditioning for traffic. Enabled is deprecated in lieu of a similar (but more generally and completely defined) property which is inherited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConditioningService_Enabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConditioningService#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

} // CIM_ConditioningService
