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
 * A representation of the model object '<em><b>CIM WRR Scheduling Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a subclass of the abstract class SchedulingElement. It introduces a new property, WeightingFactor, to give some inputs a higher probability of being serviced than other inputs. It also introduces a Priority property, to serve as a tiebreaker to be used when inputs have equal weighting factors. As is the case with all subclasses of SchedulingElement, the input associated with an instance of WRRSchedulingElement is of one of two types: either a queue, or another scheduler. Because scheduling of this type is always work conserving, the inherited boolean property, WorkConserving, is restricted to TRUE in this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WRRSchedulingElement#getWeightingFactor <em>Weighting Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WRRSchedulingElement#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WRRSchedulingElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.WorkConserving='boolean' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WRRSchedulingElement extends CIM_SchedulingElement {
	/**
	 * Returns the value of the '<em><b>Weighting Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 32-bit bit unsigned integer defining the weighting factor that offers some inputs a higher probability of being serviced than other inputs. The property's minimum value is 0, its maximum value is 100000, and its Units are thousandths.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weighting Factor</em>' attribute.
	 * @see #setWeightingFactor(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_WRRSchedulingElement_WeightingFactor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Thousandths' MinValue='0' MaxValue='100000'"
	 * @generated
	 */
	Long getWeightingFactor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WRRSchedulingElement#getWeightingFactor <em>Weighting Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting Factor</em>' attribute.
	 * @see #getWeightingFactor()
	 * @generated
	 */
	void setWeightingFactor(Long value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16-bit bit unsigned integer which serves as a tiebreaker, in the event that two or more inputs have equal weights. A larger value represents a higher priority. While this condition may not occur in some implementations of a weighted round robin scheduler, many implementations require a priority to resolve an equal-weight condition. In the instances where this behavior is not necessary or is undesirable, the property may be left unspecified. 
	 * 
	 * If this property is specified for any of the WRRSchedulingElements associated with a PacketSchedulingService, then it MUST be specified for all WRRSchedulingElements for that PacketSchedulingService, and the property values for these WRRSchedulingElements MUST all be different.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_WRRSchedulingElement_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WRRSchedulingElement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

} // CIM_WRRSchedulingElement
