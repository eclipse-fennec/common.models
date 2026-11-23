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

import org.dmtf.cim.CIM_EndpointOfNetworkPipe;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Endpoint Of Network Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EndpointOfNetworkPipeImpl#getSourceOrSink <em>Source Or Sink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EndpointOfNetworkPipeImpl extends CIM_DependencyImpl implements CIM_EndpointOfNetworkPipe {
	/**
	 * The default value of the '{@link #getSourceOrSink() <em>Source Or Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOrSink()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOURCE_OR_SINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceOrSink() <em>Source Or Sink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOrSink()
	 * @generated
	 * @ordered
	 */
	protected Integer sourceOrSink = SOURCE_OR_SINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EndpointOfNetworkPipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EndpointOfNetworkPipe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSourceOrSink() {
		return sourceOrSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceOrSink(Integer newSourceOrSink) {
		Integer oldSourceOrSink = sourceOrSink;
		sourceOrSink = newSourceOrSink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE__SOURCE_OR_SINK, oldSourceOrSink, sourceOrSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE__SOURCE_OR_SINK:
				return getSourceOrSink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE__SOURCE_OR_SINK:
				setSourceOrSink((Integer)newValue);
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
			case CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE__SOURCE_OR_SINK:
				setSourceOrSink(SOURCE_OR_SINK_EDEFAULT);
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
			case CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE__SOURCE_OR_SINK:
				return SOURCE_OR_SINK_EDEFAULT == null ? sourceOrSink != null : !SOURCE_OR_SINK_EDEFAULT.equals(sourceOrSink);
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
		result.append(" (SourceOrSink: ");
		result.append(sourceOrSink);
		result.append(')');
		return result.toString();
	}

} //CIM_EndpointOfNetworkPipeImpl
