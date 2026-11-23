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

import org.dmtf.cim.CIM_UnixThread;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Unix Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getOtherSchedPolicy <em>Other Sched Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getGuardSize <em>Guard Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getDetachState <em>Detach State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getInheritSched <em>Inherit Sched</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getContentionScope <em>Contention Scope</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getConcurrencyLevel <em>Concurrency Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getCancelState <em>Cancel State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UnixThreadImpl#getCancelType <em>Cancel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UnixThreadImpl extends CIM_ThreadImpl implements CIM_UnixThread {
	/**
	 * The default value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCHED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer schedPolicy = SCHED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SCHED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSchedPolicy() <em>Other Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected String otherSchedPolicy = OTHER_SCHED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardSize() <em>Guard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardSize()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardSize() <em>Guard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardSize()
	 * @generated
	 * @ordered
	 */
	protected String guardSize = GUARD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetachState() <em>Detach State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DETACH_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetachState() <em>Detach State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetachState()
	 * @generated
	 * @ordered
	 */
	protected Integer detachState = DETACH_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritSched() <em>Inherit Sched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritSched()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INHERIT_SCHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInheritSched() <em>Inherit Sched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritSched()
	 * @generated
	 * @ordered
	 */
	protected Integer inheritSched = INHERIT_SCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentionScope() <em>Contention Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentionScope()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTENTION_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentionScope() <em>Contention Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentionScope()
	 * @generated
	 * @ordered
	 */
	protected Integer contentionScope = CONTENTION_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackSize() <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackSize() <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackSize()
	 * @generated
	 * @ordered
	 */
	protected String stackSize = STACK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcurrencyLevel() <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONCURRENCY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcurrencyLevel() <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyLevel()
	 * @generated
	 * @ordered
	 */
	protected Long concurrencyLevel = CONCURRENCY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelState() <em>Cancel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CANCEL_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelState() <em>Cancel State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelState()
	 * @generated
	 * @ordered
	 */
	protected Integer cancelState = CANCEL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelType() <em>Cancel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CANCEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelType() <em>Cancel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelType()
	 * @generated
	 * @ordered
	 */
	protected Integer cancelType = CANCEL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UnixThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UnixThread();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSchedPolicy() {
		return schedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedPolicy(Integer newSchedPolicy) {
		Integer oldSchedPolicy = schedPolicy;
		schedPolicy = newSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__SCHED_POLICY, oldSchedPolicy, schedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSchedPolicy() {
		return otherSchedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSchedPolicy(String newOtherSchedPolicy) {
		String oldOtherSchedPolicy = otherSchedPolicy;
		otherSchedPolicy = newOtherSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__OTHER_SCHED_POLICY, oldOtherSchedPolicy, otherSchedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuardSize() {
		return guardSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuardSize(String newGuardSize) {
		String oldGuardSize = guardSize;
		guardSize = newGuardSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__GUARD_SIZE, oldGuardSize, guardSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDetachState() {
		return detachState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetachState(Integer newDetachState) {
		Integer oldDetachState = detachState;
		detachState = newDetachState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__DETACH_STATE, oldDetachState, detachState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInheritSched() {
		return inheritSched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInheritSched(Integer newInheritSched) {
		Integer oldInheritSched = inheritSched;
		inheritSched = newInheritSched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__INHERIT_SCHED, oldInheritSched, inheritSched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getContentionScope() {
		return contentionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentionScope(Integer newContentionScope) {
		Integer oldContentionScope = contentionScope;
		contentionScope = newContentionScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__CONTENTION_SCOPE, oldContentionScope, contentionScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStackSize() {
		return stackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackSize(String newStackSize) {
		String oldStackSize = stackSize;
		stackSize = newStackSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__STACK_SIZE, oldStackSize, stackSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConcurrencyLevel() {
		return concurrencyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcurrencyLevel(Long newConcurrencyLevel) {
		Long oldConcurrencyLevel = concurrencyLevel;
		concurrencyLevel = newConcurrencyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__CONCURRENCY_LEVEL, oldConcurrencyLevel, concurrencyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCancelState() {
		return cancelState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelState(Integer newCancelState) {
		Integer oldCancelState = cancelState;
		cancelState = newCancelState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__CANCEL_STATE, oldCancelState, cancelState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCancelType() {
		return cancelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelType(Integer newCancelType) {
		Integer oldCancelType = cancelType;
		cancelType = newCancelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNIX_THREAD__CANCEL_TYPE, oldCancelType, cancelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNIX_THREAD__SCHED_POLICY:
				return getSchedPolicy();
			case CimPackage.CIM_UNIX_THREAD__OTHER_SCHED_POLICY:
				return getOtherSchedPolicy();
			case CimPackage.CIM_UNIX_THREAD__GUARD_SIZE:
				return getGuardSize();
			case CimPackage.CIM_UNIX_THREAD__DETACH_STATE:
				return getDetachState();
			case CimPackage.CIM_UNIX_THREAD__INHERIT_SCHED:
				return getInheritSched();
			case CimPackage.CIM_UNIX_THREAD__CONTENTION_SCOPE:
				return getContentionScope();
			case CimPackage.CIM_UNIX_THREAD__STACK_SIZE:
				return getStackSize();
			case CimPackage.CIM_UNIX_THREAD__CONCURRENCY_LEVEL:
				return getConcurrencyLevel();
			case CimPackage.CIM_UNIX_THREAD__CANCEL_STATE:
				return getCancelState();
			case CimPackage.CIM_UNIX_THREAD__CANCEL_TYPE:
				return getCancelType();
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
			case CimPackage.CIM_UNIX_THREAD__SCHED_POLICY:
				setSchedPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__OTHER_SCHED_POLICY:
				setOtherSchedPolicy((String)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__GUARD_SIZE:
				setGuardSize((String)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__DETACH_STATE:
				setDetachState((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__INHERIT_SCHED:
				setInheritSched((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__CONTENTION_SCOPE:
				setContentionScope((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__STACK_SIZE:
				setStackSize((String)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__CONCURRENCY_LEVEL:
				setConcurrencyLevel((Long)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__CANCEL_STATE:
				setCancelState((Integer)newValue);
				return;
			case CimPackage.CIM_UNIX_THREAD__CANCEL_TYPE:
				setCancelType((Integer)newValue);
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
			case CimPackage.CIM_UNIX_THREAD__SCHED_POLICY:
				setSchedPolicy(SCHED_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__OTHER_SCHED_POLICY:
				setOtherSchedPolicy(OTHER_SCHED_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__GUARD_SIZE:
				setGuardSize(GUARD_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__DETACH_STATE:
				setDetachState(DETACH_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__INHERIT_SCHED:
				setInheritSched(INHERIT_SCHED_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__CONTENTION_SCOPE:
				setContentionScope(CONTENTION_SCOPE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__STACK_SIZE:
				setStackSize(STACK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__CONCURRENCY_LEVEL:
				setConcurrencyLevel(CONCURRENCY_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__CANCEL_STATE:
				setCancelState(CANCEL_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_UNIX_THREAD__CANCEL_TYPE:
				setCancelType(CANCEL_TYPE_EDEFAULT);
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
			case CimPackage.CIM_UNIX_THREAD__SCHED_POLICY:
				return SCHED_POLICY_EDEFAULT == null ? schedPolicy != null : !SCHED_POLICY_EDEFAULT.equals(schedPolicy);
			case CimPackage.CIM_UNIX_THREAD__OTHER_SCHED_POLICY:
				return OTHER_SCHED_POLICY_EDEFAULT == null ? otherSchedPolicy != null : !OTHER_SCHED_POLICY_EDEFAULT.equals(otherSchedPolicy);
			case CimPackage.CIM_UNIX_THREAD__GUARD_SIZE:
				return GUARD_SIZE_EDEFAULT == null ? guardSize != null : !GUARD_SIZE_EDEFAULT.equals(guardSize);
			case CimPackage.CIM_UNIX_THREAD__DETACH_STATE:
				return DETACH_STATE_EDEFAULT == null ? detachState != null : !DETACH_STATE_EDEFAULT.equals(detachState);
			case CimPackage.CIM_UNIX_THREAD__INHERIT_SCHED:
				return INHERIT_SCHED_EDEFAULT == null ? inheritSched != null : !INHERIT_SCHED_EDEFAULT.equals(inheritSched);
			case CimPackage.CIM_UNIX_THREAD__CONTENTION_SCOPE:
				return CONTENTION_SCOPE_EDEFAULT == null ? contentionScope != null : !CONTENTION_SCOPE_EDEFAULT.equals(contentionScope);
			case CimPackage.CIM_UNIX_THREAD__STACK_SIZE:
				return STACK_SIZE_EDEFAULT == null ? stackSize != null : !STACK_SIZE_EDEFAULT.equals(stackSize);
			case CimPackage.CIM_UNIX_THREAD__CONCURRENCY_LEVEL:
				return CONCURRENCY_LEVEL_EDEFAULT == null ? concurrencyLevel != null : !CONCURRENCY_LEVEL_EDEFAULT.equals(concurrencyLevel);
			case CimPackage.CIM_UNIX_THREAD__CANCEL_STATE:
				return CANCEL_STATE_EDEFAULT == null ? cancelState != null : !CANCEL_STATE_EDEFAULT.equals(cancelState);
			case CimPackage.CIM_UNIX_THREAD__CANCEL_TYPE:
				return CANCEL_TYPE_EDEFAULT == null ? cancelType != null : !CANCEL_TYPE_EDEFAULT.equals(cancelType);
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
		result.append(" (SchedPolicy: ");
		result.append(schedPolicy);
		result.append(", OtherSchedPolicy: ");
		result.append(otherSchedPolicy);
		result.append(", GuardSize: ");
		result.append(guardSize);
		result.append(", DetachState: ");
		result.append(detachState);
		result.append(", InheritSched: ");
		result.append(inheritSched);
		result.append(", ContentionScope: ");
		result.append(contentionScope);
		result.append(", StackSize: ");
		result.append(stackSize);
		result.append(", ConcurrencyLevel: ");
		result.append(concurrencyLevel);
		result.append(", CancelState: ");
		result.append(cancelState);
		result.append(", CancelType: ");
		result.append(cancelType);
		result.append(')');
		return result.toString();
	}

} //CIM_UnixThreadImpl
