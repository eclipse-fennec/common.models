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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_PassThroughModule;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Pass Through Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getLinkTechnologies <em>Link Technologies</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getOtherLinkTechnologies <em>Other Link Technologies</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getIsProgrammable <em>Is Programmable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getNumberOfPorts <em>Number Of Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getInternalPorts <em>Internal Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PassThroughModuleImpl#getExternalPorts <em>External Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PassThroughModuleImpl extends CIM_LogicalModuleImpl implements CIM_PassThroughModule {
	/**
	 * The cached value of the '{@link #getLinkTechnologies() <em>Link Technologies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> linkTechnologies;

	/**
	 * The cached value of the '{@link #getOtherLinkTechnologies() <em>Other Link Technologies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLinkTechnologies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherLinkTechnologies;

	/**
	 * The default value of the '{@link #getIsProgrammable() <em>Is Programmable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProgrammable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PROGRAMMABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsProgrammable() <em>Is Programmable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProgrammable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isProgrammable = IS_PROGRAMMABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfPorts() <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPorts()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfPorts = NUMBER_OF_PORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalPorts() <em>Internal Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> internalPorts;

	/**
	 * The cached value of the '{@link #getExternalPorts() <em>External Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> externalPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PassThroughModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PassThroughModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLinkTechnologies() {
		if (linkTechnologies == null) {
			linkTechnologies = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PASS_THROUGH_MODULE__LINK_TECHNOLOGIES);
		}
		return linkTechnologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherLinkTechnologies() {
		if (otherLinkTechnologies == null) {
			otherLinkTechnologies = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PASS_THROUGH_MODULE__OTHER_LINK_TECHNOLOGIES);
		}
		return otherLinkTechnologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsProgrammable() {
		return isProgrammable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsProgrammable(Boolean newIsProgrammable) {
		Boolean oldIsProgrammable = isProgrammable;
		isProgrammable = newIsProgrammable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PASS_THROUGH_MODULE__IS_PROGRAMMABLE, oldIsProgrammable, isProgrammable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfPorts() {
		return numberOfPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfPorts(Integer newNumberOfPorts) {
		Integer oldNumberOfPorts = numberOfPorts;
		numberOfPorts = newNumberOfPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PASS_THROUGH_MODULE__NUMBER_OF_PORTS, oldNumberOfPorts, numberOfPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInternalPorts() {
		if (internalPorts == null) {
			internalPorts = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PASS_THROUGH_MODULE__INTERNAL_PORTS);
		}
		return internalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getExternalPorts() {
		if (externalPorts == null) {
			externalPorts = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PASS_THROUGH_MODULE__EXTERNAL_PORTS);
		}
		return externalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AssignPorts(Boolean Mapped, Integer InternalPort, Integer ExternalPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PASS_THROUGH_MODULE__LINK_TECHNOLOGIES:
				return getLinkTechnologies();
			case CimPackage.CIM_PASS_THROUGH_MODULE__OTHER_LINK_TECHNOLOGIES:
				return getOtherLinkTechnologies();
			case CimPackage.CIM_PASS_THROUGH_MODULE__IS_PROGRAMMABLE:
				return getIsProgrammable();
			case CimPackage.CIM_PASS_THROUGH_MODULE__NUMBER_OF_PORTS:
				return getNumberOfPorts();
			case CimPackage.CIM_PASS_THROUGH_MODULE__INTERNAL_PORTS:
				return getInternalPorts();
			case CimPackage.CIM_PASS_THROUGH_MODULE__EXTERNAL_PORTS:
				return getExternalPorts();
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
			case CimPackage.CIM_PASS_THROUGH_MODULE__LINK_TECHNOLOGIES:
				getLinkTechnologies().clear();
				getLinkTechnologies().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__OTHER_LINK_TECHNOLOGIES:
				getOtherLinkTechnologies().clear();
				getOtherLinkTechnologies().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__IS_PROGRAMMABLE:
				setIsProgrammable((Boolean)newValue);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__NUMBER_OF_PORTS:
				setNumberOfPorts((Integer)newValue);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__INTERNAL_PORTS:
				getInternalPorts().clear();
				getInternalPorts().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__EXTERNAL_PORTS:
				getExternalPorts().clear();
				getExternalPorts().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PASS_THROUGH_MODULE__LINK_TECHNOLOGIES:
				getLinkTechnologies().clear();
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__OTHER_LINK_TECHNOLOGIES:
				getOtherLinkTechnologies().clear();
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__IS_PROGRAMMABLE:
				setIsProgrammable(IS_PROGRAMMABLE_EDEFAULT);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__NUMBER_OF_PORTS:
				setNumberOfPorts(NUMBER_OF_PORTS_EDEFAULT);
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__INTERNAL_PORTS:
				getInternalPorts().clear();
				return;
			case CimPackage.CIM_PASS_THROUGH_MODULE__EXTERNAL_PORTS:
				getExternalPorts().clear();
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
			case CimPackage.CIM_PASS_THROUGH_MODULE__LINK_TECHNOLOGIES:
				return linkTechnologies != null && !linkTechnologies.isEmpty();
			case CimPackage.CIM_PASS_THROUGH_MODULE__OTHER_LINK_TECHNOLOGIES:
				return otherLinkTechnologies != null && !otherLinkTechnologies.isEmpty();
			case CimPackage.CIM_PASS_THROUGH_MODULE__IS_PROGRAMMABLE:
				return IS_PROGRAMMABLE_EDEFAULT == null ? isProgrammable != null : !IS_PROGRAMMABLE_EDEFAULT.equals(isProgrammable);
			case CimPackage.CIM_PASS_THROUGH_MODULE__NUMBER_OF_PORTS:
				return NUMBER_OF_PORTS_EDEFAULT == null ? numberOfPorts != null : !NUMBER_OF_PORTS_EDEFAULT.equals(numberOfPorts);
			case CimPackage.CIM_PASS_THROUGH_MODULE__INTERNAL_PORTS:
				return internalPorts != null && !internalPorts.isEmpty();
			case CimPackage.CIM_PASS_THROUGH_MODULE__EXTERNAL_PORTS:
				return externalPorts != null && !externalPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_PASS_THROUGH_MODULE___ASSIGN_PORTS__BOOLEAN_INTEGER_INTEGER:
				return AssignPorts((Boolean)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (LinkTechnologies: ");
		result.append(linkTechnologies);
		result.append(", OtherLinkTechnologies: ");
		result.append(otherLinkTechnologies);
		result.append(", IsProgrammable: ");
		result.append(isProgrammable);
		result.append(", NumberOfPorts: ");
		result.append(numberOfPorts);
		result.append(", InternalPorts: ");
		result.append(internalPorts);
		result.append(", ExternalPorts: ");
		result.append(externalPorts);
		result.append(')');
		return result.toString();
	}

} //CIM_PassThroughModuleImpl
