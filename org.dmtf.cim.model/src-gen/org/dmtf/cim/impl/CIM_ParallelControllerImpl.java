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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_ParallelController;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Parallel Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParallelControllerImpl#getDMASupport <em>DMA Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParallelControllerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParallelControllerImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ParallelControllerImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ParallelControllerImpl extends CIM_ControllerImpl implements CIM_ParallelController {
	/**
	 * The default value of the '{@link #getDMASupport() <em>DMA Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMASupport()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DMA_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDMASupport() <em>DMA Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMASupport()
	 * @generated
	 * @ordered
	 */
	protected Boolean dmaSupport = DMA_SUPPORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Integer security = SECURITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ParallelControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ParallelController();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDMASupport() {
		return dmaSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMASupport(Boolean newDMASupport) {
		Boolean oldDMASupport = dmaSupport;
		dmaSupport = newDMASupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARALLEL_CONTROLLER__DMA_SUPPORT, oldDMASupport, dmaSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Integer newSecurity) {
		Integer oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PARALLEL_CONTROLLER__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PARALLEL_CONTROLLER__DMA_SUPPORT:
				return getDMASupport();
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_PARALLEL_CONTROLLER__SECURITY:
				return getSecurity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PARALLEL_CONTROLLER__DMA_SUPPORT:
				setDMASupport((Boolean)newValue);
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__SECURITY:
				setSecurity((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PARALLEL_CONTROLLER__DMA_SUPPORT:
				setDMASupport(DMA_SUPPORT_EDEFAULT);
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_PARALLEL_CONTROLLER__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PARALLEL_CONTROLLER__DMA_SUPPORT:
				return DMA_SUPPORT_EDEFAULT == null ? dmaSupport != null : !DMA_SUPPORT_EDEFAULT.equals(dmaSupport);
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_PARALLEL_CONTROLLER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_PARALLEL_CONTROLLER__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (DMASupport: ");
		result.append(dmaSupport);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", Security: ");
		result.append(security);
		result.append(')');
		return result.toString();
	}

} //CIM_ParallelControllerImpl
